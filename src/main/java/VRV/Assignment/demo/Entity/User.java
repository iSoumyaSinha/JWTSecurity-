package VRV.Assignment.demo.Entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



import lombok.*;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String username;
	    private String password;

	    @ManyToMany(fetch = FetchType.EAGER)
	    private Set<Role> roles = new HashSet<>();

	  
}


