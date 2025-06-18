package Bridgelab.Level1;

public class ProfitLosecalculator {
	public static void main(String args []) {
		double costprice = 129;
		double sellingprice = 191;
		double profit = sellingprice - costprice;
		double percentage = (profit / costprice)*100;
		System.out.println("th costprice is INR" +costprice +"the selling price is INR" + sellingprice + "the profit is" + profit +"the profit percentage is " + percentage );
		
	}

}
