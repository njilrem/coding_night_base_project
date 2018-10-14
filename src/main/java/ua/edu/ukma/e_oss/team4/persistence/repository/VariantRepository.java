package ua.edu.ukma.e_oss.team4.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ukma.e_oss.team4.entity.Variant;

import java.util.List;

public interface VariantRepository extends JpaRepository<Variant, Integer> {
    List<Variant> findAll();
    Variant findVariantById(int id);
}
