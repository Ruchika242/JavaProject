package Pratice;

public class Prime {

	int num;
	boolean isPrime=true;
	
	void checkPrime() {
		if(num<=1) {
			isPrime=false;
				
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					
				}
			}
		}
		if(isPrime) {
			System.out.println("Number is Prime: "+num);
		}
		else {
			System.out.println("Number is not Prime: "+num);
			
		}
	}
}
