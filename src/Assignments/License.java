package Assignments;

public class License {

	int age;
	String currentLevel;
	String testType;

	void licenseIssued() {

		if (age >= 16 && currentLevel.equals("None")) {
			if (testType.equals("examClear")) {
				System.out.println("G1 License will be issued");
			} else {
				System.out.println("Need to clear the exam then G1 will be issued");
			}

		} else if (age >= 17 && currentLevel.equals("G1")) {
			if (testType.equals("g1ExitRoadTest")) {
				System.out.println("G2 License will be issued");
			} else {
				System.out.println("G2 License will not be issued");
			}
		}

		else if (age >=18 && currentLevel.equals("G2")) {
			if (testType.equals("g2ExitRoadTest")) {
				System.out.println("G will be issued");

			} else {
				System.out.println("G will not be issued");
			}
		}

		else {
			System.out.println("License will not be issued");
			
		}

	}
}
