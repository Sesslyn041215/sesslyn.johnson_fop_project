package day12And13.solved;

public class StringValidationDemo2 {
	public static void main(String[] args) {

		String input = "Surya";

		if (input == null) {
			System.out.println("The input String is Null");
		} else if (input.trim().isEmpty()) {
			System.out.println("The input String is Empty");
		} else {
			System.out.println("The Input String is: " + input);
		}

	}
}
