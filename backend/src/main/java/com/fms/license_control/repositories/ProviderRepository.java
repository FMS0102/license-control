package com.fms.license_control.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.license_control.entities.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long>{

}

