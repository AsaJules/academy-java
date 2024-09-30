package com.bptn_Week2;

public class BankSystem {

	public static void main(String[] args) {
		
		BankAccount testAccount = new BankAccount("987654", 1200.00);
		testAccount.displayAccountInfo();
		
		BankAccount newTestAccount = new BankAccount("123456", 600.00);
		newTestAccount.displayAccountInfo();
		
		SavingsAccount myAccount = new SavingsAccount("SAVINGS123", 500.00, 1.00);
		myAccount.applyInterest();
		myAccount.displayAccountInfo();
		

	}

}
