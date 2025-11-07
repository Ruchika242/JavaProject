package classAndMethods;

public class Employee {
    String firstName;
    String lastName;
    double hourlyRate;
    double workingHours;
    
    public Employee(String firstN,String lastN, double Rate) {
		firstName=firstN;
		lastName=lastN;
		hourlyRate=Rate;
		
	}
    
    void caluclateWeeklySalary() {
    	double weeklySalary= hourlyRate*workingHours;
    	System.out.println(weeklySalary);
    }
}
