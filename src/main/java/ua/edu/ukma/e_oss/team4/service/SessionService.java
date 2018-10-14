package ua.edu.ukma.e_oss.team4.service;
import ua.edu.ukma.e_oss.team4.entity.Session;
public interface SessionService {
    Session insert(int id);
    void update(Session session);
    void remove(Session session);
    boolean ifExists(Session session);
}
