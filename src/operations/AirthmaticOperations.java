package operations;

public class AirthmaticOperations {
int num1;
double num2;

void addTwoNumbers() {
	double sum = num1 + num2;
	System.out.println("Addition of"+num1+" and  "+num2+" = "+sum);
}

void subractionOfTwoNumbers() {
	double difference = num2 -num1;
	System.out.println("Sub of of "+num1+" and  "+num2+"  = "+difference);
	
}

void divisionOfTwoNumbers() {
	double quotient = num1/num2;
	double modulus = num1%num2;
	System.out.println("Quotient of "+num1+" and "+num2+"  = "+quotient);
	System.out.println("Modulus of of "+num1+" and  "+num2+"  = "+modulus);
}
}
