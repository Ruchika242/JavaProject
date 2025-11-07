package assignment3;

import java.util.Scanner;

/*Assignment -> Banquet Hall
Question 
Write a program to get complete bill at a Banquet hall by creating a class named Banquet. 
The class Banquet takes base cost for booking banquet hall, cost of food, beverages, taxes on food, taxes on beverage and tip as an attribute. 
There should be 4 methods,
•	First method calculateBaseCost() should calculate base cost on the basis of base booking cost, cost of food,tip and beverage. This method should accept 3 arguments(base cost, food cost, beverage cost and tip)  and return the value of total base cost. 
•	Second method calculatetax() should calculate tax on base cost and  returns the value of tax. You can keep tax percentage as per your wish. This method takes return value of the method calculateBaseCost() as its input parameter and on the basis of input parameter, it calculates tax on base cost.
•	Third Method calculateCess() tax should calculate the Cess as per below condition
Depending upon the number of guests, another tax which is known as service cess is calculated as follow:
1: Less than or equal to 40 guests, cess is 4% of the total bill before taxes
2: More than 40 and up to 80 guests, cess is 8% of the total bill before taxes.
3: For more than 80 and less than 150 guests, cess is 10% of the total bill before taxes.
4: For more than 150 guests, cess will be 12.5% of the total bill before taxes.
1.	This method will take 2 parameters, first is number of guests and second parameter is the return value of the method calculateBaseCost() as its input parameter.
On the basis of 2 input it calculate Cess tax.
•	Last method  CalculateTheTotalCost() will calculate the total cost of booking banquet hall and it takes 3 input as parameter. All 3 parameters are the return value of following methods 
2.	calculateBaseCost()
3.	calculatetax()
4.	calculateCess()
Finally, print the total cost in CalculateTheTotalCost() method.
Note: Keep the main method class as separate and 'Banquet' class separate, use object of Banquet class to access its methods and attributes.
Take all inputs through keyboard Only.
*/

public class BanquetMain {

	public static void main(String[] args) {
		Banquet banquet = new Banquet();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of guests: ");
		if (!sc.hasNextInt()) {
			System.out.println("Please enter number only.");
			return;
		}
		int guestsNo = sc.nextInt();
		if (guestsNo <= 0 || guestsNo > 1000) {
			System.out.println("Enter number b/w 0-1001.");
			return;
		}

		System.out.print("Enter base cost b/w 100-5000: ");
		if (!sc.hasNextInt()) {
			System.out.println("Please enter number only.");
			return;
		}
		int basec = sc.nextInt();
		if (basec < 100 || basec > 5000) {
			System.out.println("Base cost should be b/w 100 and 5000.");
			return;
		}

		System.out.print("Enter food cost b/w 100-8000): ");
		if (!sc.hasNextInt()) {
			System.out.println("Please enter number only.");
			return;
		}
		int foodc = sc.nextInt();
		if (foodc < 100 || foodc > 8000) {
			System.out.println("Food cost should be between 100 and 8000.");
			return;
		}

		System.out.print("Enter beverage cost above 0: ");
		if (!sc.hasNextInt()) {
			System.out.println("Please enter number only.");
			return;
		}
		int bevc = sc.nextInt();
		if (bevc < 0) {
			System.out.println("Beverage cost cannot be negative.");
			return;
		}

		System.out.print("Enter tip amount above 0: ");
		if (!sc.hasNextInt()) {
			System.out.println("Please enter number only.");
			return;
		}
		int tipcost = sc.nextInt();
		if (tipcost < 0) {
			System.out.println("Tip cannot be negative.");
			return;
		}

		int basecost = banquet.calculateBaseCost(basec, foodc, bevc, tipcost);
		double taxcost = banquet.calculatetax(basec);
		double cesscost = banquet.calculateCess(guestsNo, basecost);

		banquet.calculateTotalCost(basecost, taxcost, cesscost);

	}
}
