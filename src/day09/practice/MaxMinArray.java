package day09.practice;

public class MaxMinArray {
	public static void main(String[] args) {

		int[] numbers = { 85, 65, 75, 90, 70 };
		int max = numbers[0];
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
