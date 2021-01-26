package com.fms.license_control.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.license_control.dto.CriticalActivityDTO;
import com.fms.license_control.services.CriticalActivityService;

@RestController
@RequestMapping(value = "/activities")
public class CriticalActivityController {
	
	@Autowired
	private CriticalActivityService service;
	
	@GetMapping
	public ResponseEntity<List<CriticalActivityDTO>> findAll(){
		List<CriticalActivityDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
