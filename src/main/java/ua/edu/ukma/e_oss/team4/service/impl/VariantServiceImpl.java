package ua.edu.ukma.e_oss.team4.service.impl;
import ua.edu.ukma.e_oss.team4.entity.Variant;
import ua.edu.ukma.e_oss.team4.service.VariantService;
import  ua.edu.ukma.e_oss.team4.persistence.repository.VariantRepository;

import javax.annotation.Resource;
import java.util.Optional;

public class VariantServiceImpl implements VariantService {
    @Resource
    private VariantRepository variantRepository;

    public Optional<Variant> findVariantById(int id){
        return variantRepository.findById(id);
    }

    @Override
    public Variant insert(int id) {
        return null;
    }

    @Override
    public void update(Variant variant) {

    }

    @Override
    public void remove(Variant variant) {

    }

    @Override
    public boolean ifExists(Variant variant) {
        return false;
    }
}
