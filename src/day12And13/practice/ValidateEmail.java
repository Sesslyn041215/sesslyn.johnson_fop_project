package day12And13.practice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateEmail {
	public String isEmailValid(String emailInput) throws IllegalArgumentException {
		try {
			if (emailInput == null || emailInput.isBlank()) {
				throw new IllegalArgumentException("email cannot be null or empty");
			}
			String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			Pattern ptn = Pattern.compile(regexPattern);
			Matcher matcher = ptn.matcher(emailInput);
			if (!matcher.matches()) {
				throw new IllegalArgumentException("Email doesn't match the pattern");
			}
			return "Valid String";
		} catch (IllegalArgumentException e) {
			return "Invalid email";
		}
	}
}