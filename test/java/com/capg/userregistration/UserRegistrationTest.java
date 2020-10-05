package com.capg.userregistration;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {
	
	static UserRegistration userRegistration = null;
	 @BeforeClass
	 public  static void setUp() {
		 userRegistration = new UserRegistration();
		 }

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue_ElseFalse() {
		
		assertEquals("You have entered Invalid First Name", true , userRegistration.validateFirstName("Rajan"));
		assertEquals("You have entered Valid First Name", false, userRegistration.validateFirstName("1rajan"));
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue_ElseFalse() {
		
		assertEquals("You have entered Invalid Last Name", true , userRegistration.validateLastName("Kumar"));
		assertEquals("You have entered Valid Last Name", false, userRegistration.validateLastName("7@kumar"));
		
	}
	
	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue_ElseFalse() {
		
		assertEquals("You have entered Invalid Email Id", true , userRegistration.validateEmailId("amirajangupta@gmail.com"));
		assertEquals("You have entered Valid First Name", false, userRegistration.validateEmailId("@amira@gmail.com.co.in"));
		
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue_ElseFalse() {
		
		assertEquals("You have entered Invalid Mobile Number", true , userRegistration.validateMobileNumber("91 9876543021"));
		assertEquals("You have entered Valid First Name", false, userRegistration.validateMobileNumber("91 8776476"));
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue_ElseFalse() {
		
		assertEquals("You have entered Invalid Password", true , userRegistration.validatePassword("Capgemeni@2020"));
		assertEquals("You have entered Valid First Name", false, userRegistration.validatePassword("j29838"));
		
	}
}
