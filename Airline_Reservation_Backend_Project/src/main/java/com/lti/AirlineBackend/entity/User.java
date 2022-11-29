package com.lti.AirlineBackend.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@Column(length=20)
	private String userEmail;
	@Column(length=20)
	private String userTitle;
	@Column(length=20)
	private String userFirstName;
	@Column(length=20)
	private String userLastName;
	@Column(length=20)
	private String userDob;
	@Column(length=20)
	private String userPassword;
	@Column(length=20)
	private String userPhone;
	@Column(length=20)
	private String que;
	@Column(length=20)
	private String ans;
	
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTitle() {
		return userTitle;
	}
	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserDob() {
		return userDob;
	}
	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public User(String userEmail, String userTitle, String userFirstName, String userLastName, String userDob,
			String userPassword, String userPhone, String que, String ans) {
		super();
		this.userEmail = userEmail;
		this.userTitle = userTitle;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userDob = userDob;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.que = que;
		this.ans = ans;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userTitle=" + userTitle + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userDob=" + userDob + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", que=" + que + ", ans=" + ans + "]";
	}
	
	
	
	
	
	


	
	
	
	
	
	

}
