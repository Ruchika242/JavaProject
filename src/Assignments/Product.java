package Assignments;

public class Product {
	double productPrice;
	String promoCode;

	void finalProductPrice() {
		// comments added
		if (productPrice <= 0) {
			System.out.println("Please enter Valid Price");
			return;

		}

		double discountedPrice = productPrice * 0.5;
		double additionalDiscount = 0;
		if (promoCode == null
				|| (!promoCode.equals("Promo5") && !promoCode.equals("Promo10") && !promoCode.equals("Promo20"))) {
			System.out.println("Please enter valid PromoCode as entered code is invalid, Enjoy 50% Off");
			System.out.println("final price of product will be " + discountedPrice);
			return;

		} else {
			if (promoCode.equals("Promo5")) {
				additionalDiscount = 0.05;
			}

			else {
				if (promoCode.equals("Promo10")) {
					additionalDiscount = 0.10;
				} else if (promoCode.equals("Promo20")) {
					additionalDiscount = 0.20;
				}

			}
			double finalProductPrice = discountedPrice - (discountedPrice * additionalDiscount);
			System.out.println("final price of product will be " + finalProductPrice);
		}
	}

}
