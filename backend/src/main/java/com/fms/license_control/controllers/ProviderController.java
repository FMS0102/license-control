package com.fms.license_control.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.license_control.dto.ProviderDTO;
import com.fms.license_control.services.ProviderService;

@RestController
@RequestMapping(value = "/providers")
public class ProviderController {
	
	@Autowired
	private ProviderService service;
	
	@GetMapping
	public ResponseEntity<List<ProviderDTO>> findAll(){
		List<ProviderDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
