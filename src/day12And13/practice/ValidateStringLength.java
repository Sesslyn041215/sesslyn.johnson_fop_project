package day12And13.practice;

public class ValidateStringLength {
	public String isValidLength(String str) throws IllegalArgumentException {
		try {
			if (str == null || str.isBlank()) {
				throw new IllegalArgumentException();
			}
			if (str.trim().length() < 5 || str.trim().length() > 15) {
				throw new IllegalArgumentException();
			}
			return "Valid String";
		} catch (RuntimeException e) {
			return "Invalid String";
		}
	}
}