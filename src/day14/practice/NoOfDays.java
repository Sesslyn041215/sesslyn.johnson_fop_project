package day14.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NoOfDays {
	public static void main(String[] args) {
		
        LocalDate dateBefore = LocalDate.of(2004,12, 15);
        LocalDate dateAfter = LocalDate.of(2023,06, 21);
 
        long noOfYears = dateBefore.until(dateAfter, ChronoUnit.YEARS);
        long noOfMonths = dateBefore.until(dateAfter, ChronoUnit.MONTHS);
        long noOfWeeks = dateBefore.until(dateAfter, ChronoUnit.WEEKS);
        long daysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        
        System.out.println("Years: "+ noOfYears);
        System.out.println("Months: "+ noOfMonths);
        System.out.println("Weeks: "+ noOfWeeks);
        System.out.println("Days: "+ daysBetween);
        
    }
}
