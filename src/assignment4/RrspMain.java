package assignment4;

public class RrspMain {

	public static void main(String[] args) {
		Rrsp rrsp = new Rrsp();
		rrsp.rate = 4.5;
		double totalInterest = rrsp.calculateInterest(10000, 2);
		System.out.println(totalInterest);

	}

}
