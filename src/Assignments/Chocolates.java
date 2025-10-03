package Assignments;

public class Chocolates {
	int currentChocolates = 27;
	int addChocolatesOnce = 5;
	int maxChocolates = 63;


	void chocolateBox() {

		for (int currentChocolates = 27; currentChocolates + addChocolatesOnce<=maxChocolates; currentChocolates += addChocolatesOnce) {
			System.out.println("chocolates in box: " + (currentChocolates + addChocolatesOnce));
		}

		
	}
	
}
