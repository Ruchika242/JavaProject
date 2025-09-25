package conditionalStatements;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		Account ruchi = new Account();
		Scanner sc = new Scanner(System.in);
		ruchi.overDraftAmount = 15000;
		ruchi.actualPin = 1215;
		ruchi.balanceAmount = 5000;
		System.out.println("Enter the pin");
		ruchi.enteredPin = sc.nextInt();
		System.out.println("Enter the withdraw amount ");

		ruchi.withdrawAmount = sc.nextInt();
		ruchi.validatePin();
	

		//ruchi.withdrawAmtFromATM();
	}

}
