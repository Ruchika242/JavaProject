package operations;

import java.util.Scanner;

public class AirthmaticOpMain {

	public static void main(String[] args) {
		AirthmaticOperations ao1= new AirthmaticOperations();
		
		ao1.num1= 20;
		ao1.num2=5.5;
		
		ao1.addTwoNumbers();
		ao1.subractionOfTwoNumbers();
		ao1.divisionOfTwoNumbers();
	    
		AssignmentOperators ao2 = new AssignmentOperators();
		ao2.ageAfter10Years();
		ao2.ageBefore5Years();
		ao2.tripleTheAge();
		ao2.halfOfUpdatedAge();
	
	

}
}
