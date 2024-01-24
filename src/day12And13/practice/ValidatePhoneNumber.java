package day12And13.practice;

public class ValidatePhoneNumber {
	public String isPhoneNoValid(long phoneNoInput) throws IllegalArgumentException {
		try {
			if (phoneNoInput < 6000000001L) {
				throw new IllegalArgumentException();
			}
			if (phoneNoInput > 9999999999L) {
				throw new IllegalArgumentException();
			}
			return "phone number contains 10 digits";
		} catch (IllegalArgumentException e) {
			return "phone number deosn't contains 10 digits";
		}
	}
}
