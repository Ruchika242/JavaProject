package ArraysConsMethods;

public class PhoneShop {
	String brandName;
	String[] mobileName;
	
	
	//initialization of constructor:
	
	public PhoneShop(String NameOfBrand, String[] NameOfMobile) {
		brandName=NameOfBrand;
		mobileName=NameOfMobile;
		  
	}
	
	void displayMobileNames() {
		System.out.println("Show all phones of brand: " +brandName);
		for(String mobile:mobileName) {
			System.out.println(mobile);
		}
		
	}
	
	boolean isMobileAvaialble(String mobName) {
		for(String mobile : mobileName ) {
			if(mobile.equalsIgnoreCase(mobName)) {
				return true;
			}
		}
		
		return false;
	}

}
