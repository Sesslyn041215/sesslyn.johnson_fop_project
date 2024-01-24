package day14.practice;

import java.util.Scanner;
public class InputReverse {
	public static void main(String[] args) {
		
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a string: "); 
	  String inputNew = input.nextLine();
	  
	  String[] words = inputNew.split(" ");
	  
	 StringBuilder builder = new StringBuilder();
	 for(int i= words.length-1; i>=0; i--) {
		 builder.append(words[i]).append(" ");
	 }
   
     System.out.println("Your Output is : " + builder);
	}
	    
}
