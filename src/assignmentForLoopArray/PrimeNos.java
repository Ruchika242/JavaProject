package assignmentForLoopArray;

public class PrimeNos {
	void printPrimeNos() {
		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;

			// Check if num is divisible by any number from 2 to num-1
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false; // Not prime
					break;
				}
			}

			
			if (isPrime) {
				System.out.print(num + " ");
			}
		}
	}

}
