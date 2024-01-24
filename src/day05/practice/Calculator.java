package day05.practice;

public class Calculator {

	int num1;
	int num2;
	int sum;
	int sub;
	int multiple;
	int divide;

	public Calculator(int newNum1, int newNum2) {
		 num1 = newNum1;
		 num2 = newNum2;
	}

	public int getSum(){
		return sum;
	}
	
	public void setSum(int newNumber) {
		sum = newNumber;
	}
	
	public int getSub(){
		return sub;
	}
	
	public void setSub(int newNumber) {
		sub = newNumber;
	}
	
	public int getMultiple(){
		return multiple;
	}
	
	public void setMultiple(int newNumber) {
		multiple = newNumber;
	}
	
	public float getDivide(){
		return multiple;
	}
	
	public void setDivide(int newNumber) {
		divide = newNumber;
	}
	
	public int addition() {
		int sum = num1 + num2;
		return sum;
	}

	public int subtraction() {
		int sub = num1 - num2;
		return sub;
	}

	
	
	public int multiplication() {
		int multiple = num1 * num2;
		return multiple;
	}

	public float division() {
	    float divide = (float) num1 / num2;
	    return divide;
	}
	
	@Override
	public String toString() {
		String calculus = "Add: " + addition() + ", " + "Sub:  " + subtraction() + ", "  + "Multiply: " + multiplication() +  ", " + "Division: " + division() ;
		System.out.println(calculus);
		return calculus;
	}

}
