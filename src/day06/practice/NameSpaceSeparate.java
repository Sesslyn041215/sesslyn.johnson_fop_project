package day06.practice;

public class NameSpaceSeparate {
	public static void main(String[] args) {

		String fullName = "Jane Doe";

		int spaceIndex = fullName.indexOf(" ");

		String firstName = fullName.substring(0, spaceIndex);

		String lastName = fullName.substring(spaceIndex + 1);

		System.out.println(firstName);
		System.out.println(lastName);
	}
}
