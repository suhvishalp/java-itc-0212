package test;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate startDt = LocalDate.now();
		LocalDate endDt = startDt.plusYears(3);
		
		LocalDate dt = LocalDate.now().plusYears(3);
		
		System.out.println("start = " + startDt);
		System.out.println("last = " + endDt);

	}

}
