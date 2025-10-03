package Assignments;

public class WaterTank {
	int waterTankCapacityinLitre= 100;
	int bucketCapacityinLitre= 20;
	int currentWaterInTank = -5;
	
	void WaterTankCapcity() {
		while(currentWaterInTank+bucketCapacityinLitre<=waterTankCapacityinLitre) {
			currentWaterInTank+=bucketCapacityinLitre;
			System.out.println("Water filled in Tank: " +currentWaterInTank);
			
		}
		 
		
	}

}
