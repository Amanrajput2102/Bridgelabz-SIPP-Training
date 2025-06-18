package Bridgelab.Level1;

public class PenDistribution {
	public static void main(String args []) {
		int pen = 14;
		int students = 3;
		 int penperstudnet = pen / students;
		 int remainingpen = pen % students;
		 System.out.println("the equalnumber of pen among student" +" "+ penperstudnet );
		 System.out.println("The remaining pen are "+ remainingpen);
		 
	}

}
