package day06.solved;

public class SolvedApp {
	  public static void main(String[] args) {
	        SolvedUser newUser = new SolvedUser("john", "doe", " jDoe@EXAMPLE.Com ", "password123", " 123-456-7890 ");
	        newUser.toString();

	        // checking password
	        System.out.println(newUser.authenticate("password123"));  // prints: true
	        System.out.println(newUser.authenticate("wrongpassword"));  // prints: false
	    }
}
