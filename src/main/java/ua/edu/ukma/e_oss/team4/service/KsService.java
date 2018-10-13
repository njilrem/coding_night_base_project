package ua.edu.ukma.e_oss.team4.service;
import ua.edu.ukma.e_oss.team4.entity.Ks;
public interface KsService {
    Ks get(int id);
    void update(Ks ks);
    void remove(Ks ks);
    boolean ifExists(Ks ks);

}
