package ua.edu.ukma.e_oss.team4.service.impl;
import ua.edu.ukma.e_oss.team4.entity.User;
import ua.edu.ukma.e_oss.team4.persistence.repository.UserRepository;
import ua.edu.ukma.e_oss.team4.service.UserService;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {

@Resource
private  UserRepository userRepository;

    public User findByName(String name) {
        return userRepository.findUserByName(name);
    }
    public User findById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User get(String name) {
        return null;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }

    @Override
    public boolean ifExists(User user) {
        return false;
    }
}





