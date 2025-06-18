package Bridgelab.Level1;
import java.util.Scanner;

public class FeeDiscount {
	public static void main(String args []) {
		Scanner Scanner = new Scanner (System.in);
		double fee = Scanner.nextDouble();
		System.out.println("Enter the fee");
		 double discountprice = Scanner.nextDouble();
		 System.out.println("Enter the discount price");
		 double discountfee = (fee * discountprice)/100;
		 double finalfee = fee - discountfee;
		 System.out.println("the final  fee is "+ finalfee);
		 Scanner.close();
		
	}

}
