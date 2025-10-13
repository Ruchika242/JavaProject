package assignmentForLoopArray;

public class Digits {
	int num= 23641;
	int count = 0;
	int originalNumber=num;
	
	void findDigitsCount() {

	if(num==0)
	{
		count = 1;
	}

	else
	{
		while (num!= 0) {
			num = num / 10;
			count++;
		}
	}System.out.println("no. of digits: "+count);
}

}
