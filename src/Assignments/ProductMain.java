package Assignments;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Product pd = new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product price");
		pd.productPrice = sc.nextDouble();
		sc.nextLine();
		
		if(pd.productPrice<=0) {
			System.out.println("Please enter valid price");
			sc.close();
			return;
		}
		
		System.out.println("Enter the promo code");
		pd.promoCode = sc.next();
	
		
		pd.finalProductPrice();
		sc.close();
		

	}

}
