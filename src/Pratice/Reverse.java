package Pratice;

public class Reverse {
	int num = 3421;
	int rev=0;
	
	void doReverse() {
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
		}
		System.out.println("Reverse of num is: "+rev);
		
	}

}
