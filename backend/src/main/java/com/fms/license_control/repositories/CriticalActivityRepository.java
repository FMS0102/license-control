package com.fms.license_control.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.license_control.entities.CriticalActivity;

public interface CriticalActivityRepository extends JpaRepository<CriticalActivity, Long>{

}

