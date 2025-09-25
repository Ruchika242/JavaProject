package Assignments;

public class License {

	int age;
	String currentLevel;

	void licenseIssued() {

		if (age >= 16 && age < 17 && currentLevel.equals("None")) {
			System.out.println("G1 License will be issued at");

		} else if (age >= 17 && age < 18 && currentLevel.equals("G1")) {
			System.out.println("G2 License will be issued");
		}

		else if (age >= 18 && currentLevel.equals("G2"))

		{
			System.out.println("G License will be issued");

		} else {
			System.out.println("License will not be issued");
		}

	}
}
