package assignment4;

public class Rrsp {

	double rate;

	double calculateInterest(int baseAmt, int time) {
		double findInterest = (baseAmt * rate * time) / 100;
		return findInterest;

	}
}
