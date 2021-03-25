package com.inventory.form;

public class UserForm {
	
	String userName;
	String password;
	
	public UserForm(String userName, String password) {
		this.userName =  userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}	
