package ua.edu.ukma.e_oss.team4.service;
import ua.edu.ukma.e_oss.team4.entity.Variant;
public interface VariantService {
    Variant insert(int id);
    void update(Variant variant);
    void remove(Variant variant);
    boolean ifExists(Variant variant);
}
