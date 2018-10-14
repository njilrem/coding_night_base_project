package ua.edu.ukma.e_oss.team4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ukma.e_oss.team4.entity.Session;
import ua.edu.ukma.e_oss.team4.persistence.repository.SessionRepository;
import ua.edu.ukma.e_oss.team4.service.SessionService;

import javax.annotation.Resource;
import java.sql.Date;
import java.sql.Timestamp;

//@Service
public class SessionServiceImpl implements SessionService {

    @Resource
    private SessionRepository sessionRepository;

    @Override
    public Session createSession(Timestamp dateFrom, Timestamp dateTo) {
        Session session = Session.builder()
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .build();
        return sessionRepository.save(session);
    }

    @Override
    public Session getFutureSession() {
        return null;
    }

    @Override
    public void update(Session session) {

    }

    @Override
    public void remove(Session session) {

    }
}
