package assignment4;

import java.util.Scanner;

public class AverageMain {

	public static void main(String[] args) {
		Average average = new Average();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int number2 = sc.nextInt();

		System.out.println("Enter third number: ");
		int number3 = sc.nextInt();

		System.out.println("Enter fourth number: ");
		int number4 = sc.nextInt();

		System.out.println("Enter fifth number: ");
		int number5 = sc.nextInt();

		double avg = average.calculateAverage(number1, number2, number3, number4, number5);
		System.out.println("Average of 5 numbers: " + avg);

	}

}
