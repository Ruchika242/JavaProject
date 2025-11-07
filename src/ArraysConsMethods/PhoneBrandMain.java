package ArraysConsMethods;

import java.util.Scanner;

import firstPackage.MobilePhone;

public class PhoneBrandMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// I have declared array of brand having mobiles:
		String[] samsungMobiles = { "S20", "S21", "Flip3", "Fold3" };
		String[] googleMobiles = { "Google Pixel 6", "Google Pixel6 Pro", "Google Pixel Pro", "GooglePixel 5" };
		String[] appleMobiles = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 11" };

		// I have created objects for every array og brand:
		PhoneShop sam = new PhoneShop("Samsung", samsungMobiles);
		PhoneShop google = new PhoneShop("Google", googleMobiles);
		PhoneShop apple = new PhoneShop("Apple", appleMobiles);

		// Calling Method:

		//sam.displayMobileNames();
		//google.displayMobileNames();
		//apple.displayMobileNames();

		// Ask from user to enter the product name:

		System.out.println("Enter the mobile name:");
		String enteredMobileName = sc.nextLine();
		
		//Calling Method:

		boolean isSamsungMobileAvailable = sam.isMobileAvaialble(enteredMobileName);
		boolean isGoogleMobileAvailable = google.isMobileAvaialble(enteredMobileName);
		boolean isAppleMobileAvailable = apple.isMobileAvaialble(enteredMobileName);

		// Check entered mobile name is from given brand or not:

		if (isSamsungMobileAvailable) {
			System.out.println("Mobile selected is " + enteredMobileName + " from brand Samsung");
		} else if (isGoogleMobileAvailable) {
			System.out.println("Mobile selected is " + enteredMobileName + " from brand Google");

		} else if (isAppleMobileAvailable) {
			System.out.println("Mobile selected is " + enteredMobileName + " from brand Apple");
		} else {
			System.out.println("Entered mobile name is not from our given list of mobiles, please select the mobile from the list");
		}

	}

}
