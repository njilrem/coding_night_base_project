package ua.edu.ukma.e_oss.team4.service;
import  ua.edu.ukma.e_oss.team4.entity.SessionDocs;
public interface SessionDocsService {
    SessionDocs insert(int id);
    void update(SessionDocs sessionDocks);
    void remove(SessionDocs sessionDocks);
    boolean ifExists(SessionDocs sessionDocs);
}
