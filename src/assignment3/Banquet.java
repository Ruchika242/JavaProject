package assignment3;

public class Banquet {
	int baseBookingCost;
	int foodCost;
	int beveragesCost;
	int foodTax;
	int beveragesTax;
	int tip;

	// first method
	int calculateBaseCost(int baseCost, int costfood, int costBeverages, int tip) {
		int totalBaseCost = baseCost + costfood + costBeverages + tip;

		return totalBaseCost;

	}

	double calculatetax(int totalBaseCost) {

		double taxValue = (0.13 * totalBaseCost) + foodTax + beveragesTax;
		return taxValue;
	}

	double calculateCess(int noOfGuests, int totalBaseCost) {
		double cessTax=0;

		if (noOfGuests > 0 && noOfGuests <= 40) {
			cessTax = 4 / 100 * (totalBaseCost);
			

		} else if (noOfGuests > 40 && noOfGuests <= 80) {
			cessTax = 8 / 100 * (totalBaseCost);
			
		} else if (noOfGuests > 80 && noOfGuests < 150) {
			cessTax = 10 / 100 * (totalBaseCost);
			
		}

		else if (noOfGuests > 150 && noOfGuests<=1000) {
			cessTax = 12.5 / 100 * (totalBaseCost);
			
		}


		return cessTax;
	}

	void calculateTotalCost(double totalBaseCost, double taxValue, double totalCessTax) {
		double totalCost = totalBaseCost + taxValue + totalCessTax;

		System.out.println("Total Base Cost will be " + totalBaseCost);
		System.out.println("Total tax value will be " + taxValue);
		System.out.println("Total Cess will be " + totalCessTax);
		System.out.println("Total Cost will be " + totalCost);

	}

}
