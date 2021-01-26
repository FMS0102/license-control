package com.fms.license_control.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.license_control.dto.LicenseDTO;
import com.fms.license_control.services.LicenseService;

@RestController
@RequestMapping(value = "/licenses")
public class LicenseController {
	
	@Autowired
	private LicenseService service;
	
	@GetMapping
	public ResponseEntity<List<LicenseDTO>> findAll(){
		List<LicenseDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
