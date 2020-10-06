package com.capg.userregistration;

public class UserRegistration {
	private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z\\s]{2,}";
	private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z\\s]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,}([_+-.]{1}[a-zA-Z]{2,})?";
	private static final String MOBILE_NUMBER_PATTERN = "[0-9]{2} [0-9]{10}";
	private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9 ]).{8,}";
	
	
	public boolean validateFirstName(String firstName) throws InvalidUserException
	{
		try {
			if(firstName.matches(FIRST_NAME_PATTERN))
				return true;
			else
				throw new InvalidUserException("Invalid First Name.");
		}
		catch (Exception e) {  //For any input other than correct and wrong format .e.g input is null.
			throw new InvalidUserException("Invalid First Name.");
		}
	}
	
	public boolean validateLastName(String lastName) throws InvalidUserException 
	{
		try {
			if(lastName.matches(LAST_NAME_PATTERN))
				return true;
			else
				throw new InvalidUserException("Invalid Last Name.");
		}
		catch (Exception e) { //For any input other than correct and wrong format .e.g input is null.
			throw new InvalidUserException("Invalid Last Name.");
		}
	}
	
	public boolean validateEmailId(String emailId) throws InvalidUserException
	{
		try {
			if(emailId.matches(EMAIL_ID_PATTERN))
				return true;
			else
				throw new InvalidUserException("Invalid Email Id.");
		}
		catch (Exception e) {  //For any input other than correct and wrong format .e.g input is null.
			throw new InvalidUserException("Invalid Email Id.");
		}
	}
	
	public boolean validateMobileNumber(String mobileNumber) throws InvalidUserException
	{
		try {
			if(mobileNumber.matches(MOBILE_NUMBER_PATTERN))
				return true;
			else
				throw new InvalidUserException("Invalid Mobile Number.");
		}
		catch (Exception e) {  //For any input other than correct and wrong format .e.g input is null.
			throw new InvalidUserException("Invalid Mobile Number.");
		}
	}
	
	public boolean validatePassword(String password) throws InvalidUserException
	{
		try {
			if(password.matches(PASSWORD_PATTERN))
				return true;
			else
				throw new InvalidUserException("Invalid Password.");
		}
		catch (Exception e) {  //For any input other than correct and wrong format .e.g input is null.
			throw new InvalidUserException("Invalid Password.");
		}
	}
}
