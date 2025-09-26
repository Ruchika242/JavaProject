package switchCase;

import java.util.Scanner;

public class SwitchCaseMain {

	public static void main(String[] args) {
		SwitchCaseExample calculator = new SwitchCaseExample();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1");
		calculator.num1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the num2");
		calculator.num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the operator");
		calculator.requestedOperator = sc.next();
		sc.nextLine();

		calculator.performOperation();
		sc.close();

	}

}
