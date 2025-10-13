package assignmentForLoopArray;

public class Prime {
	int num = 7; 
	boolean isPrime = true;
	
	void checkPrime() {
    if(num<=1)
	{
		isPrime = false;
	}else
	{
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

	}
}}
