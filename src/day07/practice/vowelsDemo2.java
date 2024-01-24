package day07.practice;

public class VowelsDemo2 {
	public static void main(String[] args) {
		 
		//1st method
		 
//		 char vowels = 'e';
//		 if( vowels == 'A' || vowels =='E' || vowels == 'I' || vowels =='O'  || vowels == 'U' || vowels == 'a' || vowels == 'e'  || vowels =='i' || vowels == 'o' || vowels == 'u') {
//			 System.out.println("The character is a vowel");
//		 } else {
//			 System.out.println("The character is a consonant");
//		 }
		 
		 
		 
		 //2nd method
//		 char vowels = 'd';
//		    String vowelString = "AEIOUaeiou";
//		    
//		    if (vowelString.contains(Character.toString(vowels))) {
//		        System.out.println("The character is a vowel");
//		    } else {
//		        System.out.println("The character is a consonant");
//		    }
		 
		 
		//3rd method
			 String character = "D";
			 String stringLowerCase = character.toLowerCase();
			 String v ="aeiou";
			 if( v.contains(stringLowerCase)) {
				 System.out.println("The character " .concat (character +" is a vowel") );
			 } else {
				 System.out.println("The character "  .concat (character +" is a consonant"));
			 }
			 
	 }
}
