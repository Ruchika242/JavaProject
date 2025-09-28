package Assignments;

public class Chocolates {
	int currentChocolates = 27;
	int addChocolatesOnce = 5;
	int maxChocolates = 63;

	void chocolateBox() {
		while (currentChocolates + addChocolatesOnce<=63);
			
		{
			currentChocolates+=addChocolatesOnce;
			System.out.println("chocolates in box: " + currentChocolates);
		}
		
		System.out.println("final no. of chocolates in box :"+currentChocolates);

	}
}
