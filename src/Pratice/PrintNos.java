package Pratice;

public class PrintNos {
	
	int n;
	int i=1;
	void printNumbers() {
		while(i<=n) {
			System.out.println("Print all numbers "+i);
			i++;
		}
	}
	



   void loopInfinite() {
	   int j=1;
	   while(true) {
		   System.out.println("Number: " +j);
		   j++;
	   }
   }
}
