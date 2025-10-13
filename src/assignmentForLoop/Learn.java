package assignmentForLoop;

public class Learn {
	// wap to find the sum of all numbers which are not completely divisible by 3.

	int[] a = { 2, 6, 8, 9, 10, 11, 15, 17, 18, 20 };
	int sum = 0;

	void notDivisibleByThree() {
		for (int i = 0; i <= a.length-1; i++) {
			if (a[i] % 3 != 0) {
		
				sum = sum + a[i];

			}

		}
		System.out.println("Sum of all numbers which are not divisible by " + sum);
	}

}
