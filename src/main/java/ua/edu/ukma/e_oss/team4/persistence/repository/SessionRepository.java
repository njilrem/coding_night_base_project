package ua.edu.ukma.e_oss.team4.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ukma.e_oss.team4.entity.Session;

import java.sql.Date;

public interface SessionRepository extends JpaRepository<Session, Integer> {

}
