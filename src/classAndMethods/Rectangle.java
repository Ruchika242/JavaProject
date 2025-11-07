package classAndMethods;

public class Rectangle {
	int lengthInCm;
	int breadthInCm;
	
	public Rectangle(int length, int breadth) {
		lengthInCm=length;
		breadthInCm=breadth;
	}
	
	int area() {
		int areaRectangle=lengthInCm*breadthInCm;
		return areaRectangle;
		
	}
	

	
	
}
