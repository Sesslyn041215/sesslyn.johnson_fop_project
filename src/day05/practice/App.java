package day05.practice;

public class App {
	public static void main(String[] args) { 
		
	     Student student1 = new Student("Sesslyn", (byte)18 , 149.9876579);
	     student1.setStudentGender('F');
		 student1.setStudentPercentage(95.98f);
		 student1.setStudentHeight(105.9898978907d);
		 student1.setisStudent(true);
		 student1.toString();
		 
		 Calculator calculus1 = new Calculator(60, 38);
		 
	        int sum = calculus1.addition();
	        int sub = calculus1.subtraction();
	        int multiply = calculus1.multiplication();
	        float divide = calculus1.division();
	        
	        calculus1.toString();
}
}
