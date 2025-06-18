package Bridgelab.Level1;
import java.util.Scanner;

public class KMtoMiles {
	public static void main(String args []) {
		Scanner Scanner = new Scanner(System.in);
		double km = Scanner.nextDouble();
	    System.out.println("Enter the distance");
		double miles = km/1.6;
		System.out.println("the total miles is " + miles + "for given km " + km );
		Scanner.close();
		
	}

}
