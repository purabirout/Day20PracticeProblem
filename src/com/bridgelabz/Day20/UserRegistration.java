package com.bridgelabz.Day20;

import java.util.regex.Pattern;
import com.bridgelabz.Day20.Constant;

public class UserRegistration {
	public boolean validFirstName(String fName) {
		if(Pattern.matches(Constant.FIRST_NAME_REGEX, fName))
				return true;
		else
			return false;
	}

	public boolean validLastName(String lName) {
		if(Pattern.matches(Constant.LAST_NAME_REGEX, lName))
			return true;
		else 
			return false;
	}

	public boolean validZipCode(String zipCode) {
		if (Pattern.matches(Constant.PINCODE_REGEX, zipCode))
			return true;
		else 
			return false;
	}

	public boolean validMobileNumber(String mobileNumber) {
		if (Pattern.matches(Constant.MOBILE_NUMBER_REGEX, mobileNumber))
			return true;
		else 
			return false;
	}

	public boolean validPassword(String password) {
		if (Pattern.matches(Constant.PASSWORD_REGEX, password))
			return true;
		else 
			return false;
	}

	public boolean isvalidEmail(String eMail) {
		if (Pattern.matches(Constant.USER_EMAIL_REGEX, eMail))
			return true;
		else 
			return false;
	}
}
