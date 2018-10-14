package ua.edu.ukma.e_oss.team4.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ukma.e_oss.team4.entity.Session;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Integer> {

    @Resource
    Session createSession (Date dateFrom, Date dateTo);
    List<Session> findAll();
    Session findSessionById(int id);

}
