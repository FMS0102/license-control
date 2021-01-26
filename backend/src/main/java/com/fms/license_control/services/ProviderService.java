package com.fms.license_control.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fms.license_control.dto.ProviderDTO;
import com.fms.license_control.entities.Provider;
import com.fms.license_control.repositories.ProviderRepository;

@Service
public class ProviderService {

	@Autowired
	private ProviderRepository repository;

	@Transactional(readOnly = true)
	public List<ProviderDTO> findAll() {
		List<Provider> list = repository.findAll();
		return list.stream().map(x -> new ProviderDTO(x)).collect(Collectors.toList());
	}
}
