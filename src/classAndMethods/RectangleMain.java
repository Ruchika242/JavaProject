package classAndMethods;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 5);
		Rectangle rectangle2= new Rectangle(5,8);
		
		rectangle1.area();
		rectangle2.area();
		
		System.out.println("Area of 1st Rectangle is "+rectangle1.area());
		System.out.println("Area of 2nd Rectangle is "+rectangle2.area());
		
		

	}

}
