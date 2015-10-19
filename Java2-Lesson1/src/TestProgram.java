import java.text.DecimalFormat;


/*
 *	File Name:  TestProgram.java
 *	Program:    TestProgram
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 1
 *
 * Write a program to test class SavingsAccount. 
 * Instantiate two SavingsAccount objects, saver1 and saver2, with balances
 * of $2000.00 and $3000.00, respectively. 
 * Set annualInterestRate to 4%, then calculate the monthly interest for each
 * of 12 months and print the new balances for both savers.  
 * Next, set the annualInterestRate to 5%, calculate the next month’s interest
 * and print the new balances for both savers.  (8.6)
 *
 *
 */

public class TestProgram {
	
	// Static variables for TestProgram
	private static SavingsAccount saver1;
	private static SavingsAccount saver2;
	private static DecimalFormat money = new DecimalFormat("$0.00");


	// Main program
	public static void main(String[] args) {
		
		
		createAccounts();
		modifyInterestRate4();
		calcMonthlyInterest4();
		//currentBalance();
		modiftyInterestRate5();
		calcMonthlyInterest5();
		updatedBalance();
		
		// part I missed converting saver1.getBalance toString data representation
		double aDouble = saver1.getBalance();
		String aString = Double.toString(aDouble);
		System.out.println(aString);
		
	}
	
	// Obtain the updated balance with .05% interest rate + account balance for next month
	private static void updatedBalance() {
		System.out.println("\n" + "Account Balance .05%:");
		System.out.println("Saver1 Current Balance with .05% Interest Rate: " + money.format(saver1.getBalance()));
		System.out.println("Saver1 Current Balance with .05% Interest Rate: " + money.format(saver2.getBalance()));
		
	}

	// Monthly interest rate calculation at .05% interest rate
	private static void calcMonthlyInterest5() {
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
	}

	// Update Interest Rate to .05%
	private static void modiftyInterestRate5() {
		saver1.modifyInterestRate(.05);
		saver2.modifyInterestRate(.05);
		
		
	}

	/*private static void currentBalance() {
		System.out.println("Account Balance .04%:");
		System.out.println("Saver1 Current Balance with .04% Interest Rate is : " + money.format(saver1.getBalance()));
		System.out.println("Saver1 Current Balance with .04% Interest Rate is : " + money.format(saver2.getBalance()));
		System.out.println("\n");
		
	}*/

	// Method to create accounts and set initial balance
	private static void createAccounts() {
		saver1 = new SavingsAccount(2000.00);
		saver2 = new SavingsAccount(3000.00);
		System.out.println("Bank Account Balace:");
		System.out.println("Saver1 Initial Account Balance is: " + money.format(saver1.getBalance()));
		System.out.println("Saver2 Initial Account Balance is: " + money.format(saver2.getBalance()));
		System.out.println("\n");
		
		
		
	}

	// Calculate monthly interest for each month Jan-Dec, updating account balance
	private static void calcMonthlyInterest4() {
		System.out.println("Montly Account Balance at .04% Interest");
		for (int m = 1; m <= 12; m++)
	    {
	                 
	        saver1.calculateMonthlyInterest();
	        System.out.println("Monthly Balance for 'saver1': " + money.format(saver1.getBalance()));
	         
	    }
		for (int m = 1; m <=12; m++)
		{
			saver2.calculateMonthlyInterest();
	        System.out.println("Monthly Balance for 'saver2': " + money.format(saver2.getBalance())); 
		}
		//saver1.calculateMonthlyInterest();
		//saver2.calculateMonthlyInterest();
		
	}

	// Set Interest Rate to .04%
	private static void modifyInterestRate4() {
		saver1.modifyInterestRate(.04);
		saver2.modifyInterestRate(.04);
		
	}


	
}
