package day05.solved;

public class App {
	public static void main(String[] args) {
		User user1 = new User("sesslyn@gmail.com", "Sess@15");
		user1.setName("Sesslyn");
		user1.setPhoneNo(6781040916l);
		user1.toString();
		
		Animal dog = new Animal("Dog", 4);
		dog.toString();

		Animal penguin = new Animal("penguin", 2);
		penguin.toString();
	}
}
