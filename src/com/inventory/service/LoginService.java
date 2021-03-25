package com.inventory.service;

import com.inventory.form.UserForm;

public interface LoginService 
{

	public boolean authenticateUser(UserForm userForm);
}
