package com.postgresql.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.postgresql.test.model.Provider;
import com.postgresql.test.repo.ProviderRepository;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository repository;

    public List<Provider> getAllProviders() {
        return repository.findAll();
    }
}
