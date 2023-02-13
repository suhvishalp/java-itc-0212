package test;

import java.util.Scanner;

import rop.licenseapp.bo.BankAccount;
import rop.licenseapp.bo.LoanBankAccount;
import rop.licenseapp.bo.SavingBankAccount;

public class OverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		System.out.println("Select a choice : \n 1. Saving Acc \n 2. Loan Acc");
		choice = scanner.nextInt();
		
		BankAccount bankAccount = null;
		
		switch(choice) {
		case 1:
			bankAccount = new SavingBankAccount();
			break;
			
		case 2:
			bankAccount = new LoanBankAccount();
			break;
		
		default:
			System.out.println("invalid choice");
			return;
		}
		
		bankAccount.openAccount();
		
	}

}
