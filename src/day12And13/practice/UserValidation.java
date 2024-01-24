package day12And13.practice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidation {

	String name;
	String email;
	int id;
	long phoneno;
	String password;

	// Name validation
	public boolean isNameValid(String nameInput) throws IllegalArgumentException {
		try {
			if (nameInput == null || nameInput.isBlank()) {
				throw new IllegalArgumentException("name cannot be null or empty");
			}

			String regexPattern = "^[a-zA-Z]{3,25}$";
			Pattern ptn = Pattern.compile(regexPattern);

			Matcher matcher = ptn.matcher(nameInput);
			if (!matcher.matches()) {
				throw new IllegalArgumentException("name doesn't match the pattern");
			}
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

	// Email validation
	public boolean isEmailValid(String emailInput) throws IllegalArgumentException {
		try {
			if (emailInput == null || emailInput.isBlank()) {
				throw new IllegalArgumentException("name cannot be null or empty");
			}

			String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			Pattern ptn = Pattern.compile(regexPattern);

			Matcher matcher = ptn.matcher(emailInput);
			if (!matcher.matches()) {
				throw new IllegalArgumentException("name doesn't match the pattern");
			}
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

	// Phone number Validation
	public boolean isPhoneNoValid(long phoneNoInput) throws IllegalArgumentException {
		try {
			if (phoneNoInput < 6000000001L) {
				throw new IllegalArgumentException("phone number doesn't match the pattern");
			}
			if (phoneNoInput > 9999999999L) {
				throw new IllegalArgumentException("phone number doesn't match the pattern");
			}

			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

	// Password Validation
	public boolean isPasswordValid(String passwordInput) throws IllegalArgumentException {
		try {
			if (passwordInput == null || passwordInput.isBlank()) {
				throw new IllegalArgumentException("password cannot be null or empty");
			}

			String regexPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
			Pattern ptn = Pattern.compile(regexPattern);

			Matcher matcher = ptn.matcher(passwordInput);
			if (!matcher.matches()) {
				throw new IllegalArgumentException("name doesn't match the pattern");
			}
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}

	}

	// Id validation
	public boolean isIdValid(int newId) throws IllegalArgumentException {
		try {
			if (newId < 00000 || newId > 99999) {
				throw new IllegalArgumentException("Enter valid Phone Number");
			}
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}

}
