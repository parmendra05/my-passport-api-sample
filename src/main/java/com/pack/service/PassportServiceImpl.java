package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.PassportData;
import com.pack.exception.DuplicateDataFound;
import com.pack.exception.PassportNotFoundException;
import com.pack.repository.PassportRepo;

@Service
public class PassportServiceImpl implements PassportService {

	@Autowired
	private PassportRepo repository;

	@Override
	public String createPassport(PassportData data) {
		PassportData existing = repository.findByAdharNum(data.getAdharNum());
		if (existing != null) {
			throw new DuplicateDataFound("Passport already created");
		} else {
			repository.save(data);
			return "Data Created";
		}
	}

	@Override
	public PassportData getPassport(String adhar) {
		PassportData data = repository.findByAdharNum(adhar);
		if (data != null)
			return data;
		else {
			throw new PassportNotFoundException("Adhar doesn't exist");
		}

	}

}
