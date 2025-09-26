package switchCase;

public class SwitchCaseExample {
	
	int num1;
	int num2;
	String requestedOperator;
	

	void addition() {
		int sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void subtraction() {
		int diff = num1 - num2;
		System.out.println("The diff of " + num1 + " and " + num2 + " is " + diff);
	}

	void multiplication() {
		int product = num1 * num2;
		System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
	}

	void division() {
		int quotient = num1 / num2;
		System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
		int remainder = num1 % num2;
		System.out.println("The remainder of " + num1 + " and " + num2 + " is " + remainder);
	}

	// operations performed by user

	void performOperation() {
		switch (requestedOperator) {

		case "add":
			addition();
			break;

		case "minus":
			subtraction();
			break;

		case "multiply":
			multiplication();
			break;

		case "divide":
			if (num2 != 0) {
				division();
			} else {
				System.out.println("Division by 2 no's not possible");
			}

			break;

		default:
			System.out.println("Operation requested is invalid");

		}
	}

}
