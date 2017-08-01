package com.test.bchtest.model.dto.member;

import java.sql.Date;

public class MemberDTO {
	private String userid;
	private String username;
	private String pw;
	private String email;
	private Date regdate;
	private Date moddate;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getModdate() {
		return moddate;
	}
	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", username=" + username + ", pw=" + pw + ", email=" + email + "]";
	}
	
	
	
}
