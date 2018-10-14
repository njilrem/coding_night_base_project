package ua.edu.ukma.e_oss.team4.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ukma.e_oss.team4.entity.Request;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Integer> {
    List<Request> findAll();
    Request findById(int id);
    Request findByTitle(String title);
}
