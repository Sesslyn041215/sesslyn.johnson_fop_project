package day12And13.practice;

public class User {
	String name;
	String email;
	int id;
	String password;
	long phoneNo;
	
	
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
	
	public int getId() {
		return id;
	}
	public void setId(int newId) {
	   id = newId;
	}
	
	@Override
	public String toString() {
		String userDetails = "name: " + name + ", " + "email:  " + email + ", "  + "phoneNo: " + phoneNo +  ", " + "password: " + password + "id: " + id ;
		System.out.println(userDetails);
		return userDetails;
	}

}
