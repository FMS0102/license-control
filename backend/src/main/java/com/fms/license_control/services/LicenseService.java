package com.fms.license_control.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fms.license_control.dto.LicenseDTO;
import com.fms.license_control.entities.License;
import com.fms.license_control.repositories.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	private LicenseRepository repository;

	@Transactional(readOnly = true)
	public List<LicenseDTO> findAll() {
		List<License> list = repository.findAll();
		return list.stream().map(x -> new LicenseDTO(x)).collect(Collectors.toList());
	}
}
