package com.fms.license_control.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.license_control.entities.License;

public interface LicenseRepository extends JpaRepository<License, Long>{

}

