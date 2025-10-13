package assignmentForLoopArray;

public class Reverse {
	int num = 8764209;
	int rev = 0;
	int originalNum = num;

	void reverseNumber() {
		while (num != 0) {
			int lastDigit = num % 10;
			rev = rev*10 + lastDigit;
			num = num / 10;
			

		}
		
		System.out.println("Reverse of number is: " + rev);

	}
}