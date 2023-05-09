package com.oops;

public class CheckingAccount extends BankAccount {
	private int limit;

	public CheckingAccount(String accountNumber, String accountHolderName, double balance, int overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void printAccountDetails() {
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Holder Name: " + getAccountHolderName());
		System.out.println("Account Type: Checking");
		System.out.println("Balance: " + getBalance());
		System.out.println("Overdraft Limit: " + getLimit());
	}
}
