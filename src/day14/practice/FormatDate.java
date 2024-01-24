package day14.practice;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FormatDate {
	
	public static void main(String[] args) {
		
    Date today = new Date();
  
	SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/YYYY HH:MM:SS");
	
    String  formatDate = dateFormatter.format(today);
  
    System.out.println("Today's date is " + formatDate );
    
   }
}
