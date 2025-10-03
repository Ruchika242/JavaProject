package codingPractice;

import java.util.Scanner;

public class SwapTwoNoMain {

	public static void main(String[] args) {
		SwapTwoNo stn = new SwapTwoNo();
		Scanner sc = new Scanner(System.in);
		stn.a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter value of a: ");
		stn.a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter value of b:");
		stn.a = sc.nextInt();
		sc.nextLine();
		
		stn.swap();


	}

}
