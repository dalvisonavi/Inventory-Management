package com.inventory;

import com.inventory.utility.EncryptDecryptUtility;

public class TestClass {

	public static void main(String[] args) {
		try {
			//String value = EncryptDecryptUtility.encrypt("gauri");
			//System.out.println(value);
			//oFbNJtIe35vjaq8rMrd9pA==
			
			String decValue = EncryptDecryptUtility.decrypt("oFbNJtIe35vjaq8rMrd9pA==");
			System.out.println(decValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
