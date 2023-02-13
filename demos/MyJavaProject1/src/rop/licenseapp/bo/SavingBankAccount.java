package rop.licenseapp.bo;

public class SavingBankAccount extends BankAccount {

	
	//override the superclass's openAccount() method
	public void openAccount() {
		System.out.println("Opening a Saving Account");
	}
}
