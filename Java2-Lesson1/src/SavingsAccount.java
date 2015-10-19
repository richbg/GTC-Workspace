/*
 *	File Name:  SavingsAccount.java
 *	Program:    SavingsAccount
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 1
 *
 *  Create class SavingsAccount.
 *  Use a static variable, annualInterestRate, to store the
 *  annual interest rate for all account holders.  
 *  Each object of the class contains a private instance variable, 
 *  savingsBalance, indicating the amount the saver currently has on deposit.  
 *  Provide a method, calculateMonthlyInterest, to calculate the monthly interest 
 *  by multiplying the savingsBalance by annualInterestRate divided by 12 – 
 *  this interest should be added to savingsBalance. 
 *  Provide a static method, modifyInterestRate, that sets the annualInterestRate to a new value.  
 */

public class SavingsAccount {
	static double annualInterestRate = 0.00;
	private double savingsBalance;

	//class Constructor for SavingsAccout
	public SavingsAccount() {
		savingsBalance = 1000.00;
		annualInterestRate = 0.00;
	}
	
	
	// SavingsAccount balance initializer	
	public SavingsAccount(double initBalance) {
		if (initBalance >= 1000.00)
			savingsBalance = initBalance;
		else {
			System.out.println("The initial balance is below $1000.00");
			savingsBalance = 0.00;
		}
	}
	
	// method to modify interest rate
	static void modifyInterestRate(double interestRate) {
		annualInterestRate = interestRate;
	}

	// method to calculate monthly interest rate
	void calculateMonthlyInterest() {
		savingsBalance = savingsBalance
				+ (savingsBalance * annualInterestRate / 12);
	}

	// accessor to get account Balance
	public double getBalance() {
		return savingsBalance;
	}
}