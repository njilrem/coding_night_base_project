package ua.edu.ukma.e_oss.team4.service;
import ua.edu.ukma.e_oss.team4.entity.Request;
public interface RequestService {
    Request get(int id);
    void  insert(Request request);
    void update(Request request);
    void remove(Request request);
    boolean ifExists(Request request);
}
