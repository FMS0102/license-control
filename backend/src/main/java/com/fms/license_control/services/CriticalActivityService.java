package com.fms.license_control.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fms.license_control.dto.CriticalActivityDTO;
import com.fms.license_control.entities.CriticalActivity;
import com.fms.license_control.repositories.CriticalActivityRepository;

@Service
public class CriticalActivityService {

	@Autowired
	private CriticalActivityRepository repository;

	@Transactional(readOnly = true)
	public List<CriticalActivityDTO> findAll() {
		List<CriticalActivity> list = repository.findAll();
		return list.stream().map(x -> new CriticalActivityDTO(x)).collect(Collectors.toList());
	}
}
