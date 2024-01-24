package day14.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateBirthday {
	public static void main(String[] args) {

		String birthday = "15-12-2004";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate parsedDate = LocalDate.parse(birthday, formatter);
		System.out.println("My Birthday is : " + parsedDate);
		
		
	}
}
