package assignmentForLoop;

public class Sort {

	int[] a = { 7, 4, 2, 5, 9, 8, 6, 1, 3, 0 };
	int temp;

	void sortArray() {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		for (int num : a) {
			System.out.print(num + " ");
		}
	}

}
