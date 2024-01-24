package day10And11.solved;

public class ArrayOutOfBoundsDemo {
	public static void main(String[] args) {
		int[] intArr = { 49, 50, 70 };

		// Trying access an element which is not initialised and declared
		intArr[4] = 80;
	}
}