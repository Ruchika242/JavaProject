package firstPackage;

public class MobilePhone {
	String brandName;
	int modelNumber;
	int screenSize;
	int storageCapacity;
	String operatingSystem;
	boolean isCamerPresent;
	
	void makeCalls() {
		System.out.println("Making calls by "+brandName);
		
	}
	
    void sendTextMessage() {
    	System.out.println("Sending message by "+brandName);
    }
    
    void takepictures() {
    	System.out.println("Taking pictures by "+brandName);
    }
}
