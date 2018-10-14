package ua.edu.ukma.e_oss.team4.service;
import ua.edu.ukma.e_oss.team4.entity.Vote;
public interface VoteService {
    Vote insert(int id);
    void update(Vote vote);
    void remove(Vote vote);
    boolean ifExists(Vote vote);
}
