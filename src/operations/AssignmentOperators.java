package operations;

public class AssignmentOperators {
int age = 25;
void ageAfter10Years() {
	age+=10;
	System.out.println("Age after 10 years is "+age);
	 
}

void ageBefore5Years() {
	age-=5;
	System.out.println("Age before 5 years is "+age);
	
}

void tripleTheAge() {
	age*=3;
	System.out.println("Age after 3 times is "+age);
}

void halfOfUpdatedAge() {
	age/=2;
	System.out.println("Uodated age will be "+age);

}
}
