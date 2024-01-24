package day03.practice;

public class ConversionOfDataTypes {
	public static void main(String[] args) {

		//integer
		String number = "12";
		int num = Integer.parseInt(number);
		System.out.println("num = " + num);

		//Float
		String percentage = "95.6";
		float per = Float.parseFloat(percentage);
		System.out.println("percentage = " + per);

		//Double
		String height = "125.5678";
		double studentHeight = Double.parseDouble(height);
		System.out.println("height = " + studentHeight);
		
		//boolean
		String bool = "true";
		boolean trueBool = Boolean.parseBoolean(bool);
		System.out.println("Boolean = " + trueBool);
		
		//Long
		String longNumber = "6778900379";
		long longNo = Long.parseLong(longNumber);
		System.out.println("LongNumber = " + longNo);
		
		String s = "hello";  
		char c = s.charAt(4); 
		System.out.println("1st character is = "+ c);  
	}
}
