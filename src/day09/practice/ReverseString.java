package day09.practice;
import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String[] strings = { "Sesslyn", "Jerusheya", "Ruby", "Johnson" };
		int count = strings.length;
		
		String[] reverseString = new String[count];
		
		for (int i =  0; i < count; i++) {
			reverseString[i] = strings[count - 1 - i];
		}
		System.out.print(Arrays.toString(reverseString));
	}
}
