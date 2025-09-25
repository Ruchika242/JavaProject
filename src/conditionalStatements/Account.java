package conditionalStatements;

public class Account {
	double balanceAmount = 10000;
	int withdrawAmount;
	int overDraftAmount;
	int actualPin;
	int enteredPin;
	
	// ctrl+Shift+f

	void withdrawAmtFromATM() {

		if (withdrawAmount <= 0)

		{
			System.out.println("Invalid Input");
		}

		else if (withdrawAmount <= balanceAmount || withdrawAmount <= overDraftAmount) {
			System.out.println("Customer can withdraw the cash");
		}

		else {
			System.out.println("Insufficient balance");
		}
	}
	
	void validatePin() {
		if(enteredPin==actualPin) {
			System.out.println("Pin is correct");
			if(withdrawAmount <= balanceAmount || withdrawAmount <= overDraftAmount) {
				System.out.println("Customer can withdraw cash");
				return;
			}
			else {
				System.out.println("Insufficient balance");
			}
			return;
		}
		
		
		else {
			System.out.println("Incorrect Pin");
		}
		
		
	}








}
