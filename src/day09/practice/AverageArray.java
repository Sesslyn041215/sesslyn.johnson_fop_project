package day09.practice;

public class AverageArray {
	public static void main(String[] args) {
		
		int[] numbers = { 95, 85, 75, 70, 90 };
		int average = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			average += numbers[i] / numbers.length;
		}
		System.out.println(average);
	}
}
