package assignmentForLoop;

public class LargestNumber {
	int a= -5;
	int b = 50;
	int c = 50;
	
	void findLargestNo() {
		if(a>b && a>c) {
			System.out.println("Largest number is a: "+a);
		}
		else if (b>a && b>c) {
			System.out.println("Largest number is b: "+b);
			
		}
		else {
			System.out.println("Largest number is c: "+c);
		}
	}
	

}
