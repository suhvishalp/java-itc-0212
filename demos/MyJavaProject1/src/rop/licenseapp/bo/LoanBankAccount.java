package rop.licenseapp.bo;

public class LoanBankAccount  extends BankAccount {

	//override the superclass's openAccount() method
		public void openAccount() {
			System.out.println("Opening a Loan Account");
		}
}
