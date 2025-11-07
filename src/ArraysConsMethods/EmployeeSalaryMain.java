package ArraysConsMethods;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		EmployeeSalary[] ed = {new EmployeeSalary("Deepak", 8000),new EmployeeSalary("Ruchi", 7000), new EmployeeSalary("Sam", 10000)};
		String maxSalaryEmpName= ed[0].empName;
		double maxSalary=ed[0].salary;
		
		for(int i=1;i<ed.length;i++) {
			if(ed[i].salary>maxSalary) {
				maxSalary=ed[i].salary;
				maxSalaryEmpName=ed[i].empName;
			}
		}
		System.out.println("Employee having highest salary is " +maxSalaryEmpName+ " with salary "+maxSalary);
		   
		
		
	
		
		

	}

}
