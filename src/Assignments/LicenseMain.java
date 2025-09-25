package Assignments;

import java.util.Scanner;

public class LicenseMain {

	public static void main(String[] args) {
		License lc = new License();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age");
		lc.age = sc.nextInt();

		System.out.println("Enter the current level");
		lc.currentLevel = sc.next();

		lc.licenseIssued();

		sc.close();

	}

}
