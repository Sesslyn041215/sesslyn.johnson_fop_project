package day09.practice;

public class FloatAverage {
	public static void main(String[] args) {

		float[] numbers = { 95.65f, 85.45f, 75.86f, 70.876f, 90.934f };
		float average = 0;

		for (int i = 0; i < numbers.length; i++) {
			average += numbers[i] / numbers.length;
		}
		System.out.println(average);
	}
}
