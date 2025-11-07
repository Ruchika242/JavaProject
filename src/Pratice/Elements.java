package Pratice;

public class Elements {
	int[] a = { 1, 2, 10, 12, 8, 6 };

	void printElements() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	void findMinMax() {
		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println(max);

		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			
		}
		System.out.println(min);

	}
	
	void sumAvg() {
		int sum=0;
		int avg;
		
		int n=a.length;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
			avg=sum/n;
			System.out.println(avg);
			
			
		}
		
	}
}