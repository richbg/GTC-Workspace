/*
 *	File Name:  SavingsAccountv2.java
 *	Program:    SavingsAccountv2
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 1
 *  Class: 		CIST2372-Java Programming II (40450) 
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

public class SavingsAccountv2 {
	private static double annualInterestRate = 0.00;
	private double savingsBalance;

	// class Constructor for SavingsAccout
	public SavingsAccountv2(double sBalance) {
		savingsBalance = (sBalance > 0.00) ? sBalance : 0.00;

	}

	// method to modify interest rate
	public static void modifyInterestRate(double iRate) {
		// / check interestRate for validity before setting annualInterestRate
		annualInterestRate = (iRate > 0.00) ? iRate : 0.00;
	}

	// method to calculate monthly interest rate
	public double calculateMonthlyInterest() {

		return savingsBalance += (savingsBalance * annualInterestRate / 12);

	}

	// accessor to get account Balance
	public double getBalance() {
		return savingsBalance;
	}

	// accessor to get current Interest Rate for testing
	public static double getInterestRate() {
		return annualInterestRate;

	}

	// Override the Object class toString method in the SavingsAccount
	// class to return a String representation of the SavingsAccount object
	public String toString() {
		Double aDouble = savingsBalance;
		String aString = Double.toString(aDouble);
		return aString;

	}

}