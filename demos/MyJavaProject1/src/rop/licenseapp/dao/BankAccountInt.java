package rop.licenseapp.dao;

public interface BankAccountInt {

	public abstract void openAccount();
	public abstract void closeAccount();
	public abstract void depositAmount(double amount);
	public abstract void withdrawAmount(double amount);
	public abstract void transferAmount(int from, int to, double amount);
}
