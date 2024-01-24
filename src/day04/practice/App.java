package day04.practice;

public class App {
	
	public static void main(String[] args) { 
		
     Student student1 = new Student();
	 student1.setStudentName("Sesslyn");
	 student1.setStudentAge((byte)18);
	 student1.setStudentGender('F');
	 student1.setStudentPercentage(95.98f);
	 student1.setStudentRollNo(23745);
	 student1.setStudentHeight(105.9898978907d);
	 student1.setisStudent(true);
	 student1.toString();
	
	 Calculator calculus1 = new Calculator();
	 calculus1.addition(10 , 15);
	 calculus1.subtraction(50 , 25);
	 calculus1.multiplication(50 , 25);
	 calculus1.division(10 , 4);
	
	}	
	
}

