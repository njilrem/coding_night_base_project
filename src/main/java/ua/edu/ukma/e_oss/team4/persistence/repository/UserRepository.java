package ua.edu.ukma.e_oss.team4.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ukma.e_oss.team4.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();
    User findUserById(int id);
    User findUserByName(String username);
}
