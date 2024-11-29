package VRV.Assignment.demo.Services;



import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import VRV.Assignment.demo.Entity.Role;
import VRV.Assignment.demo.Entity.User;
import VRV.Assignment.demo.Services.Impl.RoleRepository;
import VRV.Assignment.demo.Services.Impl.UserRepository;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);  
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        
        
        List<GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_" + user.getRoles()));
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }


    public void save(User user) {
       
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        Role userRole = roleRepository.findByName("USER");
        
        user.getRoles().add(userRole);
        userRepository.save(user);
    }
}

