package assignmentForLoopArray;

public class Fibonacci {
	int n = 7;
	int firstNo = 0;
	int secondNo = 1;

	public void fib() {
		System.out.print("Fibonacci Series up to " + n + " terms: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(firstNo + " ");
			int nextNo = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = nextNo;
		}
		System.out.println(); 
	}

}
