package assignmentForLoop;

public class Palindrome {

	int num = 121121;

	void isPalindrome() {
		int originalNum = num; // Store the original number
		int rev = 0;

		while (num > 0) {
			int digit = num % 10; // Get last digit
			rev = rev * 10 + digit; // Add digit to reverse
			num = num / 10; // Remove last digit
		}

		if (originalNum == rev) {
			System.out.println(originalNum + " is a palindrome");
		} else {
			System.out.println(originalNum + " is not a palindrome");
		}
	}

}