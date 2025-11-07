package assignment4;

public class Rhombus {

	double dia1;
	double dia2;

	public Rhombus(double d1, double d2) {
		dia1 = d1;
		dia2 = d2;
	}
		
	

	double findArea() {
		double area = 0.5 * dia1 * dia2;
		return area;
	}

}
