package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.entity.PassportData;

public interface PassportRepo extends JpaRepository<PassportData,Integer> {

	PassportData findByAdharNum(String adharNum);
}
