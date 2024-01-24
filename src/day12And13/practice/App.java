package day12And13.practice;

public class App {
	public static void main(String[] args) {
		UserValidation validate = new UserValidation();
		User user1 = new User();
		String name = "Sesslyn";
		int id = 115678;
		long phone = 6381040916L;
		String email = "sesslyn2004@gmail.com";
		String password = "Sess@1512";

		if (validate.isNameValid(name)) {
			user1.setName(name);
			System.out.println("Your Name is Valid and your Name is " + user1.getName());
		} else {
			System.out.println("Your Name is Not Valid");
		}
		if (validate.isIdValid(id)) {
			user1.setId(id);
			System.out.println("Your ID is Valid and your ID is " + user1.getId());
		} else {
			System.out.println("Your ID is Not Valid");
		}
		if (validate.isPhoneNoValid(phone)) {
			user1.setPhoneNo(phone);
			System.out.println("Your Phone Number is Valid and your phone number is " + user1.getPhoneNo());
		} else {
			System.out.println("Your Phone Number is Not Valid");
		}
		if (validate.isEmailValid(email)) {
			user1.setEmail(email);
			System.out.println("Your Email ID is Valid and your email id is " + user1.getEmail());
		} else {
			System.out.println("Your Email ID is Not Valid");
		}
		if (validate.isPasswordValid(password)) {
			user1.setPassword(password);
			System.out.println("Your Password is Valid and your Password is " + user1.getPassword());
		} else {
			System.out.println("Your Password is Not Valid");
		}
		user1.toString();
		
		ValidatePhoneNumber userPhonenumber = new ValidatePhoneNumber();
		ValidateEmail userEmail = new ValidateEmail();
		ValidateStringLength validString = new ValidateStringLength();
		ValidatePassword passwordValid = new ValidatePassword();
		System.out.println(userPhonenumber.isPhoneNoValid(6381040916L));
		System.out.println(userEmail.isEmailValid("sesslyn2004@gmail.com"));
		System.out.println(validString.isValidLength("Sesslyn"));
		System.out.println(passwordValid.isPasswordValid("Sess@2004"));
	}
}
