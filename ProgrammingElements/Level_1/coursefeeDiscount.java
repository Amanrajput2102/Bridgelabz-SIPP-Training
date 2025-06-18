package Bridgelab.Level1;

public class coursefeeDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee = 125000;
		double discountpercent = 10;
		 double feediscount = (fee * discountpercent)/100;
		 double finalfee = fee - feediscount;
		  System.out.println("The discount amount is "+ feediscount +"and final fee is " + fee);

	}

}
