package com.project4.member.db;

import java.sql.Date;
import java.sql.Timestamp;

public class MemberDTO {
	private String id;
	private String pw;
	private Date birthDate;
	private String phoneNum;
	private String address;
	private String email;
	private Timestamp regDate;
	private int adCheck;
	private Timestamp finalLogin;
	private int point;
	private String grade;
	private int isAdmin;
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public String getPhoneNum() {
		return phoneNum;
	}



	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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



	public Timestamp getRegDate() {
		return regDate;
	}



	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}



	public int getAdCheck() {
		return adCheck;
	}



	public void setAdCheck(int adCheck) {
		this.adCheck = adCheck;
	}



	public Timestamp getFinalLogin() {
		return finalLogin;
	}



	public void setFinalLogin(Timestamp finalLogin) {
		this.finalLogin = finalLogin;
	}



	public int getPoint() {
		return point;
	}



	public void setPoint(int point) {
		this.point = point;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public int getIsAdmin() {
		return isAdmin;
	}



	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}



	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", birthDate=" + birthDate + ", phoneNum=" + phoneNum
				+ ", address=" + address + ", email=" + email + ", regDate=" + regDate + ", adCheck=" + adCheck
				+ ", finalLogin=" + finalLogin + ", point=" + point + ", grade=" + grade + ", isAdmin=" + isAdmin + "]";
	}
	
	
}
