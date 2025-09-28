package Assignments;

public class WaterTank {
	int waterTankCapacityinLitre= 100;
	int bucketCapacityinLitre= 10;
	int currentWaterInTank = 0;
	
	void WaterTankCapcity() {
		while(currentWaterInTank+bucketCapacityinLitre<=waterTankCapacityinLitre) {
			currentWaterInTank+=bucketCapacityinLitre;
			System.out.println("Water filled in Tank: " +currentWaterInTank);
			
		}
		System.out.println("final water in tank" +currentWaterInTank);
		
	}

}
