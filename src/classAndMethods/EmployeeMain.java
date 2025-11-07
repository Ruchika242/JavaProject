package classAndMethods;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee("Ruchi", "Singh", 17.35);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the working hours: ");
		
		emp.workingHours=sc.nextDouble();
		
		emp.caluclateWeeklySalary();

	}

}
