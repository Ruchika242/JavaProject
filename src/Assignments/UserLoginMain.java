package Assignments;

import java.util.Scanner;

public class UserLoginMain {

	public static void main(String[] args) {
		UserLogin ul = new UserLogin();
		Scanner sc = new Scanner(System.in);
		while (ul.invalidAttempts > 0) {
			System.out.println("Enter username");
			ul.enteredUsername = sc.next();
			sc.nextLine();

			System.out.println("Enter password");
			ul.enteredPwd = sc.next();
			sc.nextLine();

			ul.userLoginFunctionality();

			if (ul.enteredUsername.equalsIgnoreCase(ul.expectedUserID) && ul.enteredPwd.equals(ul.expectedPwd)) {
				break;
			}

			if (ul.invalidAttempts == 0) {
				System.out.println("Account Locked");
			}

		}
	}
}
