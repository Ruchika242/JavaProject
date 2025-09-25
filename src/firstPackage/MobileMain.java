package firstPackage;

public class MobileMain {

	public static void main(String[] args) {
		MobilePhone mb1 = new MobilePhone();
		mb1.brandName = "Iphone";
		mb1.modelNumber = 17;
		mb1.screenSize = 6;
		mb1.storageCapacity = 256;
		mb1.operatingSystem = "iOS";
		mb1.isCamerPresent = true;
		
		mb1.makeCalls();
		mb1.sendTextMessage();
		mb1.takepictures();
		
		MobilePhone mb2 = new MobilePhone();
		mb2.brandName = "Samsung";
		mb2.modelNumber = 24;
		mb2.screenSize = 7;
		mb2.storageCapacity = 64;
		mb2.operatingSystem = "Android";
		mb2.isCamerPresent = true;
		
	    mb2.makeCalls();
	    mb2.sendTextMessage();
	    mb2.takepictures();
		

	}

}
