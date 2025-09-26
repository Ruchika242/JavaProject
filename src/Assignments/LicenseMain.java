package Assignments;

import java.util.Scanner;

public class LicenseMain {

	public static void main(String[] args) {
		License lc = new License();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age");
		lc.age = sc.nextInt();
		
		if(lc.age<16) {
			System.out.println("Your age is not appropriate for taking the license ");
			return;
		}
		
		System.out.println("Enter your current level");
		lc.currentLevel=sc.next();
		
		System.out.println("Enter test type");
		lc.testType=sc.next();
		
		lc.licenseIssued();

		sc.close();

	}

}
