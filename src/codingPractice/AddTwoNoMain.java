package codingPractice;

import java.util.Scanner;

public class AddTwoNoMain {

	public static void main(String[] args) {
		AddTwoNo so = new AddTwoNo();
		SwapTwoNo so1 = new SwapTwoNo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no: ");
		so.a= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter second no: ");
		so.b = sc.nextFloat();
		sc.nextLine();
		
		so.addition();
		
		
		
		

	}

}
