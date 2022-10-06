package com.bl.lambda;

@FunctionalInterface
public interface UserEntryValidator {
	public boolean validate (String input) throws UserValidationException;
	
}
