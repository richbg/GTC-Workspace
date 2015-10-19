import java.text.DecimalFormat;

/*
 *	File Name:  TestProgramv2.java
 *	Program:    TestProgramv2
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 1
 *  Class:		CIST2372-Java Programming II (40450) 
 *
 * Write a program to test class SavingsAccount.
 * Instantiate two SavingsAccount objects, saver1 and saver2, with balances
 * of $2000.00 and $3000.00, respectively.
 * Set annualInterestRate to 4%, then calculate the monthly interest for each
 * of 12 months and print the new balances for both savers.
 * Next, set the annualInterestRate to 5%, calculate the next months interest
 * and print the new balances for both savers.  (8.6)
 *
 *
 */

public class TestProgramv2 {

	private static DecimalFormat money = new DecimalFormat("$0.00");

	// Main program
	public static void main(String[] args) {

		// Create the initial account saver1 with balance of $2000.00
		// Create the initial account saver2 with balance of $3000.00
		SavingsAccountv2 saver1 = new SavingsAccountv2(2000.00);
		SavingsAccountv2 saver2 = new SavingsAccountv2(3000.00);

		// Set the Annual Interest Rate to .04%
		setRate(.04);

		// calculate the monthly interest for each of 12 months
		// and print the new balances for both savers
		runTest1(saver1, saver2, 12);

		// Print the monthly balance
		// Set the Annual Interest Rate to .05%
		setRate(.05);

		// calculate the monthly interest for the next month @ .05%
		// and print the new balances for both savers
		runTest2(saver1, saver2, 1);

		// Get the String representation of the SavingsAccount object
		System.out.println(saver1.toString() + "\n" + saver2.toString());

	}

	private static void runTest2(SavingsAccountv2 saver1,
			SavingsAccountv2 saver2, int mProvide) {
		// Verify the Annual Interest Rate is .05%
		// if the rate is not .04 an error is given with the value of the
		// interest rate provided.
		// Exit the program if the interest rate isn't set correctly
		if (SavingsAccountv2.getInterestRate() == .05) {

			// Calculate the account with the supplied Interest and update the
			// account balance for saver1
			// Print the Monthly account Balance for saver1 @ .05% interest
			for (int m = 1; m <= mProvide; m++) {

				saver1.calculateMonthlyInterest();
				System.out.println("Next Months Balance for Saver1 = "
						+ money.format(saver1.getBalance()));

			}
			// Calculate the account with the supplied Interest and update the
			// account balance for saver2
			// Print the account Balance for saver2 @ .05% interest
			for (int m = 1; m <= mProvide; m++) {
				saver2.calculateMonthlyInterest();
				System.out.println("Next Months Balance for Saver2 = "
						+ money.format(saver2.getBalance()));
			}

		} else {
			System.out.println("Invaid Interest Rate supplied: "
					+ SavingsAccountv2.getInterestRate());
			System.exit(0); // Terminate program, test invalid due to incorrect
			// Interest Rate

		}

	}

	private static void setRate(double aIR) {
		SavingsAccountv2.modifyInterestRate(aIR);

	}

	private static void runTest1(SavingsAccountv2 saver1,
			SavingsAccountv2 saver2, int mProvide) {
		// Verify the Annual Interest Rate is .04%
		// if the rate is not .04 an error is given with the value of the
		// interest rate provided.
		// Exit the program if the interest rate isn't set correctly
		if (SavingsAccountv2.getInterestRate() == .04) {

			// Calculate the account with the supplied Interest and update the
			// account balance for saver1
			// Print the Monthly account Balance for saver1 @ .04% interest
			for (int m = 1; m <= mProvide; m++) {

				saver1.calculateMonthlyInterest();
				System.out.println("Monthly Balance for Saver1 = "
						+ money.format(saver1.getBalance()));

			}
			// Calculate the account with the supplied Interest and update the
			// account balance for saver2
			// Print the account Balance for saver2 @ .04% interest
			for (int m = 1; m <= mProvide; m++) {
				saver2.calculateMonthlyInterest();
				System.out.println("Monthly Balance for Saver2 = "
						+ money.format(saver2.getBalance()));
			}

		} else {
			System.out.println("Invaid Interest Rate supplied: "
					+ SavingsAccountv2.getInterestRate());
			System.exit(0); // Terminate program, test invalid due to incorrect
			// Interest Rate
		}

	}

}
