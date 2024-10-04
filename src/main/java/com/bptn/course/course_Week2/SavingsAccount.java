package com.bptn.course.course_Week2;

class SavingsAccount extends BankAccount {
	
	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
	}
	
	public void applyInterest() {
		double interest = getBalance() * interestRate/100;
		deposit(interest);
	}
	
	

}
