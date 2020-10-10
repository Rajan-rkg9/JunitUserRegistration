package com.capg.userregistration;

import java.util.Scanner;

public class ValidateUserRegistration {
	
	private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z\\s]{2,}";
	private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z\\s]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,}([_+-.]{1}[a-zA-Z]{2,})?";
	private static final String MOBILE_NUMBER_PATTERN = "[0-9]{2} [0-9]{10}";
	private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9 ]).{8,}";
	public static FInterfaceUserRegistration validateFirstName()
	{
		FInterfaceUserRegistration interfaceObj = ( fName ) -> {
			return fName.matches(FIRST_NAME_PATTERN);
		};
		return interfaceObj;
	}
	
	public static FInterfaceUserRegistration validateLastName()
	{
		FInterfaceUserRegistration interfaceObj = ( lName ) -> {
			return lName.matches(LAST_NAME_PATTERN);
		};
		return interfaceObj;
	}
	
	public static FInterfaceUserRegistration validateEmailId()
	{
		FInterfaceUserRegistration interfaceObj = ( emailId ) -> {
			return emailId.matches(EMAIL_ID_PATTERN);
		};
		return interfaceObj;
	}
	
	public static FInterfaceUserRegistration validateMobileNumber()
	{
		FInterfaceUserRegistration interfaceObj = ( mobileNumber ) -> {
			return mobileNumber.matches(MOBILE_NUMBER_PATTERN);
		};
		return interfaceObj;
	}
	
	public static FInterfaceUserRegistration validatePassword()
	{
		FInterfaceUserRegistration interfaceObj = ( password ) -> {
			return password.matches(PASSWORD_PATTERN);
		};
		return interfaceObj;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fName=sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lName=sc.nextLine();
		System.out.println("Enter Email Id: ");
		String emailId=sc.nextLine();
		System.out.println("Enter Mobile Number: ");
		String mobile=sc.nextLine();
		System.out.println("Enter Password: ");
		String password=sc.nextLine();
		FInterfaceUserRegistration obj1 = validateFirstName();
		FInterfaceUserRegistration obj2 = validateLastName();
		FInterfaceUserRegistration obj3 = validateEmailId();
		FInterfaceUserRegistration obj4 = validateMobileNumber();
		FInterfaceUserRegistration obj5 = validatePassword();
		if(obj1.validate(fName))
			System.out.println("First Name Valid");
		else
			System.out.println("First Name Invalid");
		
		if(obj2.validate(lName))
			System.out.println("Last Name Valid");
		else
			System.out.println("Lastt Name Invalid");
		
		if(obj3.validate(emailId))
			System.out.println("EmailId Valid");
		else
			System.out.println("EmailId Invalid");
		
		if(obj4.validate(mobile))
			System.out.println("Mobile Number Valid");
		else
			System.out.println("Mobile Number Invalid");
		
		if(obj5.validate(password))
			System.out.println("Password Valid");
		else
			System.out.println("Password Invalid");	
	}
}
