package day05.practice;

import java.util.Random;

public class Student {
	String studentName;
	byte studentAge;
	int studentRollNo;
	char studentGender;
	float studentPercentage;
	double studentHeight;
	boolean isStudent;

	public Student(String newStudentName, byte newStudentAge, double newStudentHeight) {
		Random r = new Random();
		studentRollNo = r.nextInt();
		
		studentName = newStudentName;
		studentAge = newStudentAge;
		studentHeight = newStudentHeight;
	}
	// Name
	public void setStudentName(String newStudentName) {
		studentName = newStudentName;
	}

	public String getStudentName() {
		return studentName;
	}

	// Age
	public void setStudentAge(byte newStudentAge) {
		studentAge = newStudentAge;
	}

	public byte getStudentAge() {
		return studentAge;
	}

	// RollNo
	public void setStudentRollNo(int newStudentRollNo) {
		studentRollNo = newStudentRollNo;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	// Gender
	public void setStudentGender(char newStudentGender) {
		studentGender = newStudentGender;
	}

	public char getStudentGender() {
		return studentGender;
	}

	// Percent
	public void setStudentPercentage(float newStudentPercentage) {
		studentPercentage = newStudentPercentage;
	}

	public float getStudentPercentage() {
		return studentPercentage;
	}

	// Height
	public void setStudentHeight(double newStudentHeight) {
		studentHeight = newStudentHeight;
	}

	public double getStudentHeight() {
		return studentHeight;
	}

	public void setisStudent(boolean newIsStudent) {
		isStudent = newIsStudent;
	}

	public boolean newIsStudent() {
		return isStudent;
	}

	@Override
	public String toString() {
		String userDetails = "Student name: " + studentName + " Student Age:  " + studentAge + " Student RollNo: "+ studentRollNo + " Student Gender: " + studentGender + " Student Percentage: " + studentPercentage+ " Student Height: " + studentHeight + " isStudent: " + isStudent;
		System.out.println(userDetails);
		return userDetails;
	}
}
