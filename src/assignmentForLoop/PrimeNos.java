package assignmentForLoop;

public class PrimeNos {

	void primenumbers() {
		for (int num = 1; num <= 100; num++) {
			int count = 0;
	

		    for (int i = 1; i <= num; i++) {
			   if (num % i == 0) {
				count = count + 1;
			}
		}
		    
		    if (count==2) {
		    	System.out.println("number is prime: "+num);
		    	
		    }
		}
	}
}
		

