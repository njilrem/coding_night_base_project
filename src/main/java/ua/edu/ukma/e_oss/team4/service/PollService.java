package ua.edu.ukma.e_oss.team4.service;
import  ua.edu.ukma.e_oss.team4.entity.Poll;
public interface PollService {
    Poll insert(int id);
    void update(Poll poll);
    void remove(Poll poll);
    boolean ifExists(Poll poll);
}
