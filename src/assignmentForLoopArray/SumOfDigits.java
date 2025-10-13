package assignmentForLoopArray;

public class SumOfDigits {
	
	int num=1234245;
	int sum=0;
	void findSum() {
		while(num!=0) {
			int lastDigit = num%10;
			sum=sum+lastDigit;
			num=num/10;
			
		}
		System.out.println("sum of digits of num: "+sum);
	}
	}
