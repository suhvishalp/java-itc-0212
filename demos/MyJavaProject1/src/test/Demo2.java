package test;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        int number= 0;
        do {
            System.out.print("Please enter a number: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.%n", input);
            }
            number = scanner.nextInt();
        } while (number == 0);

        System.out.printf("You have entered a number %d.%n", number);
    
	}

}
