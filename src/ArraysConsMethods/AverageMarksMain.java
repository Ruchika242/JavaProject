package ArraysConsMethods;

public class AverageMarksMain {

	public static void main(String[] args) {
		AverageMarks[] am = {new AverageMarks("Ruchi", 480), new AverageMarks("Deepak", 520), new AverageMarks("Sam", 600)};
        double totalMarks=0;
        
        for(int i=0;i<am.length;i++) {
        	totalMarks=totalMarks+am[i].stdMarks;
        }
        
        
	}

}
