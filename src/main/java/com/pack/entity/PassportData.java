package com.pack.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
@Entity
public class PassportData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportNum;
	@NotBlank(message = "Name field can't be empty")
	private String usersName;
	@NotBlank(message = "Adhar field can't be empty")
	private String adharNum;
	@Past(message = "Please provide valid dob")
	private LocalDate dob;
	@Email(message = "Please provide valid email")
	private String email;
	private String address;
	
	public Integer getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(Integer passportNum) {
		this.passportNum = passportNum;
	}
	public String getUsersName() {
		return usersName;
	}
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
	public String getAdharNum() {
		return adharNum;
	}
	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PassportData [passportNum=" + passportNum + ", usersName=" + usersName + ", adharNum=" + adharNum
				+ ", dob=" + dob + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
	
}
