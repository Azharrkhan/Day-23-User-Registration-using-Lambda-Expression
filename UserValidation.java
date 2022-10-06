package com.bl.lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bl.lambda.UserValidationException.ExceptionType;

public class UserValidation {
	
	

	public UserEntryValidator validatePassword = (String userInput) -> {
		try {
			if(userInput.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			String password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";		
			System.out.println("\nValidating Password...");
			return match(password, userInput);
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
	};

	
	public UserEntryValidator validateMobileNumber = (String userInput) -> {
		try {
			if(userInput.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			String mobile = "^[0-9]{2}\\s[0-9]{10}$";
			System.out.println("\nValidating Mobile Number...");
			return match(mobile, userInput);
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
	};
	
	
	public UserEntryValidator validateEmail = (String userInput) -> {		
		try {
			if(userInput.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			String email = "^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";
			System.out.println("\nValidating Email...");
			return match(email, userInput);
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
	};
	
	
	public boolean match(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		
		return (match.matches());
	}
	
	
	public UserEntryValidator validateName = (String userInput) -> {
		try {
			if(userInput.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			String name = "^[A-Z][a-zA-Z]{2,}$";
			System.out.println("\nValidating Name...");
			return match(name, userInput);
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
	};
}
