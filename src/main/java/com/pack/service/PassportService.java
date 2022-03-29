package com.pack.service;

import com.pack.entity.PassportData;

public interface PassportService {

	String createPassport(PassportData data);

	PassportData getPassport(String adhar);

}
