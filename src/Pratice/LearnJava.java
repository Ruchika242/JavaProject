package Pratice;

public class LearnJava {
	// wap to print all nos from 1 to 100 which are completely 3 & 5.

	void printNos() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number is divisible by both 3 and 5 " + i);
			}

		}
	}

	// wap to find sum of all elements in int array and then divide that sum by the
	// largest element of that array

	int[] a = { 2, 1, 7, 3, 4 };
	int sum = 0;
	int largestNumber = a[0];
	int result;

	void sumAndLargest() {
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			

		}
		System.out.println("Sum of all number: " + sum);

		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > largestNumber) {
				largestNumber = a[i];
				System.out.println("Largest element is " + largestNumber);
			}
		}
		result = sum / largestNumber;
		System.out.println(result);

	}

}
