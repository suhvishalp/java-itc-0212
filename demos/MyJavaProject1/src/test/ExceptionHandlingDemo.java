package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("enter you age : ");
			int age = scanner.nextInt();		//10
			
			if(age<0 || age>=100) {
				throw new InvalidAgeException("Age is not valid");
			}
			
		}catch(InputMismatchException ex) {
			//what you want to do if this type of exception occurs 
			System.out.println("the input is not correct, please try again");
			
			//log the issue in the logger
		}catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("this is end of program");
	}

}
