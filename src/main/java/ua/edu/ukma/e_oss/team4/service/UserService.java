package ua.edu.ukma.e_oss.team4.service;
import ua.edu.ukma.e_oss.team4.entity.User;
public interface UserService {
    User getById(int id);
    int insert(User user);
    void update(User user);
    void remove(User user);
    boolean ifExists(User user);
}
