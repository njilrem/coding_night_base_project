package ua.edu.ukma.e_oss.team4.service.impl;

import ua.edu.ukma.e_oss.team4.entity.Request;
import ua.edu.ukma.e_oss.team4.persistence.repository.RequestRepository;
import ua.edu.ukma.e_oss.team4.service.RequestService;

import javax.annotation.Resource;

public class RequestServiceImpl implements RequestService{
    @Resource
    private RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public Request findRequestByTitle(String title){
        return requestRepository.findByTitle(title);
    }

    @Override
    public Request get(int id) {
        return null;
    }

    @Override
    public void insert(Request request) {

    }

    @Override
    public void update(Request request) {

    }

    @Override
    public void remove(Request request) {

    }

    @Override
    public boolean ifExists(Request request) {
        return false;
    }
}

