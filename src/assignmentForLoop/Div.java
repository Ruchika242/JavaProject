package assignmentForLoop;

public class Div {
	// program to print all no's (1 to 100) that are divisible by both 3 and 5

	void divisibleByThreeFive() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number is divisible by both 3 and 5: " + i);
			}

		}
	}
}
