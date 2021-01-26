package com.fms.license_control.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.license_control.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
