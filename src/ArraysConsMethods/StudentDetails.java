package ArraysConsMethods;

public class StudentDetails {
	
	String name;
	int rollNo;
	int age;
	
	public StudentDetails(String SName, int SRollNo, int SAge) {
		name=SName;
		rollNo=SRollNo;
		age=SAge;
	}
		
		
	void displayDetails() {
		System.out.println("Name, roll no. and age of student are "+name+","+rollNo+" and "+age);
			
		
		
	}

}
