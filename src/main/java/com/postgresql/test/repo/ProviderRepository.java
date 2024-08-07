package com.postgresql.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.postgresql.test.model.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {
}
