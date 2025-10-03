package assignmentForLoop;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {
		//Table tb =new Table();
		//tb.tableOfAnyNo();
		
		OddNumber on = new OddNumber();
		on.printOddNum();
		
		Divisible dv = new Divisible();
		dv.divisibleByThree();
		
		LargestNumber ln = new LargestNumber();
		ln.findLargestNo();
		
		Divide d = new Divide();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		d.num = sc.nextInt();
		
		d.divisbleBy5();
		

	}

}
