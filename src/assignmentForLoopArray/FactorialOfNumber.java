package assignmentForLoopArray;

public class FactorialOfNumber {
	int num;
	int fact = 1;

	void findFactorial() {
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("factorial of no. is " + fact);

	}

}
