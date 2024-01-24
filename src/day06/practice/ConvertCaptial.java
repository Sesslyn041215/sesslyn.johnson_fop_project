package day06.practice;

public class ConvertCaptial {
	public static void main(String[] args) {
		String fullName = "sesslyn johnson";

		String nameUpper = fullName.toUpperCase();
		int spaceIndex = nameUpper.indexOf(" ");
		int spaceIndex2 = spaceIndex + 1;

		System.out.println(nameUpper.charAt(0) + fullName.substring(1, spaceIndex) + " " + nameUpper.charAt(spaceIndex2)
				+ fullName.substring(spaceIndex2 + 1));

	}
}
