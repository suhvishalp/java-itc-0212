package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate dob = LocalDate.of(1996, 8, 12);
		
		System.out.println(dob.format(DateTimeFormatter.ofPattern("dd MMM yy")));
		
		
	}

}
