package VRV.Assignment.demo.Services.Impl;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import VRV.Assignment.demo.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
