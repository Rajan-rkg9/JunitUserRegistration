package com.capg.userregistration;

import static org.junit.Assert.assertEquals;
import com.capg.userregistration.InvalidUserException;
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
		try {
			
			userRegistration.validateFirstName("hftfyfy");
		}
		catch (InvalidUserException e) {
			assertEquals("Invalid First Name.", e.getMessage());
		}
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue_ElseFalse() {
		try {
			
			userRegistration.validateLastName("33kumar");
		}
		catch (InvalidUserException e) {
			assertEquals("Invalid Last Name.", e.getMessage());
		}	
	}
	
	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue_ElseFalse() {
		try {
			
			userRegistration.validateEmailId("amirajan@gmail@capg.com");
		}
		catch (InvalidUserException e) {
			assertEquals("Invalid Email Id.", e.getMessage());
		}	
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue_ElseFalse() {
		try {
			
			userRegistration.validateMobileNumber("91-6643436");
		}
		catch (InvalidUserException e) {
			assertEquals("Invalid Mobile Number.", e.getMessage());
		}	
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue_ElseFalse() {
		try {
			
			userRegistration.validatePassword("rakdd@4");
		}
		catch (InvalidUserException e) {
			assertEquals("Invalid Password.", e.getMessage());
		}	
	}
}
