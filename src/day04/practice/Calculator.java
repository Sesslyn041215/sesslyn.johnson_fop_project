package day04.practice;

public class Calculator {
    
	int sum;
	int sub;
	int multiple;
	int divide;
	
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
	
	
      public int addition(int num1 , int num2){
          int sum = num1+num2;
          System.out.println("Add = " + sum);
          return sum;
      }
      
      public int subtraction(int num1 , int num2){
    	  int sub = num1-num2;
          System.out.println("Subtract = " + sub);
          return sub;
      }
      
      public int multiplication(int num1 , int num2){
    	  int multiple = num1*num2;
          System.out.println("Multiply = " + multiple);
          return multiple;
      }
      
      public float division(float num1 , float num2){
    	  float divide = num1/num2;
          System.out.println("Divide = " + divide);
          return divide;
      }
      
      @Override
      public String toString() {
          String calculus = "Add: " + getSum() + ", Sub: " + getSub() + ", Multiply: " + getMultiple() + ", Division: " + getDivide();
          System.out.println(calculus);
          return calculus;
      }
       	
}
