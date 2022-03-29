package com.pack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.PassportData;
import com.pack.service.PassportService;

@RestController
@RequestMapping("/api")
public class PassportController {
	
	@Autowired
	private PassportService service;

	@PostMapping("/create")
	public ResponseEntity<String> createPassport(@Valid @RequestBody PassportData data){
		String msg=service.createPassport(data);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{adhar}")
	public ResponseEntity<PassportData> getPassport(@PathVariable String adhar){
		PassportData data=service.getPassport(adhar);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
}
