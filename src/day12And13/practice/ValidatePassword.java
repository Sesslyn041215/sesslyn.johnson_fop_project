package day12And13.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
	public String isPasswordValid(String passwordInput) throws IllegalArgumentException {
		try {
			if (passwordInput == null || passwordInput.isBlank()) {
				throw new IllegalArgumentException("password cannot be null or empty");
			}
			String regexPattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
			Pattern ptn = Pattern.compile(regexPattern);
			Matcher matcher = ptn.matcher(passwordInput);
			if (!matcher.matches()) {
				throw new IllegalArgumentException();
			}
			return "Valid Password";
		} catch (IllegalArgumentException e) {
			return "Invalid Password";
		}
	}
}