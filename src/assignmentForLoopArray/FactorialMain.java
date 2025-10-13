package assignmentForLoopArray;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		FactorialOfNumber fn = new FactorialOfNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		fn.num=sc.nextInt();
		fn.findFactorial();
		
	}
	}