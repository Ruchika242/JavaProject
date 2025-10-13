package assignmentForLoop;

public class Factorial {
	int num=10;
	int fact=1;
	
	void fact() {
		for(int i=1; i<=10; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+num+"is"+fact);
	}

}
