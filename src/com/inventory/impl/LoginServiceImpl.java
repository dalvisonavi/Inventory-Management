package com.inventory.impl;

import java.sql.SQLException;

import com.inventory.dao.LoginDAO;
import com.inventory.form.UserForm;
import com.inventory.service.LoginService;
import com.inventory.utility.EncryptDecryptUtility;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean authenticateUser(UserForm userForm) {
		// TODO Auto-generated method stub
		LoginDAO loginDAO = new LoginDAO();
		try {
			String encryptedPwd = loginDAO.retrieveUserDetails(userForm.getUserName());
			String decryptedPwd = EncryptDecryptUtility.decrypt(encryptedPwd);
			if(userForm.getPassword().equals(decryptedPwd)) {
				return true;
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}

}
