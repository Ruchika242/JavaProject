package assignmentForLoop;

public class Largest {
	
	int num1;
	int num2;
	int num3;
	
	void findLargestNumber() {
		if(num1>num2 && num1>num3) {
			System.out.println("Largest no. is "+num1);
		}
		else if(num2>num3 && num2>num1) {
			System.out.println("Largest no. is "+num2);
			
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("Largest no. is "+num3);
		}
		
	}

}
