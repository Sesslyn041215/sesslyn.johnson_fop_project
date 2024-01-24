package day06.solved;

import java.util.Random;

public class User {
	String name;
	String email;
	String password;
	long phoneNo;
	int id;

	public User(String newEmail, String newPassword) {
		Random r = new Random();
		id = r.nextInt();

		email = newEmail;
		password = newPassword;
		System.out.println("Constructor with email , password and id");
	}

	public User(String newName, long newPhoneNo) {
		Random r = new Random();
		id = r.nextInt();

		name = newName;
		phoneNo = newPhoneNo;
		System.out.println("Constructor with name , phone no and id");
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {

		email = newEmail;

	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long newPhoneNo) {
		phoneNo = newPhoneNo;

	}
	public long getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;

	}

	@Override
	public String toString() {
		String userDetails = "name: " + name + ", " + "email:  " + email + ", "  + "phoneNo: " + phoneNo +  ", " + "password: " + password + ", " +"Id: " + id;
		System.out.println(userDetails);
		return userDetails;
	}

}
