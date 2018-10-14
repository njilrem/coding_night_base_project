package ua.edu.ukma.e_oss.team4.service;
import ua.edu.ukma.e_oss.team4.entity.Session;

import java.sql.Date;
import java.sql.Timestamp;

public interface SessionService {
    Session createSession(Timestamp dateFrom, Timestamp dateTo);
    Session getFutureSession();
    void update(Session session);
    void remove(Session session);
}
