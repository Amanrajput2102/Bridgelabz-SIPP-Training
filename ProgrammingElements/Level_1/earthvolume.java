package Bridgelab.Level1;

public class earthvolume {
	public static void main(String args[]) {
		double radius = 6378;
		double pi = 3.14;
		double volume = (4.0/3.0)*pi* Math.pow(radius, 3);
		double miles = volume /Math.pow (1.6 , 3);
		System.out.println("the volume of earth in km " +volume+ "and in miles "+ miles );
	}

}
