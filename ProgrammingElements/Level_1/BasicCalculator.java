package Bridgelab.Level1;
import java .util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = Scanner.nextDouble();
		System.out.println("Enter the second number ");
		double num2 = Scanner.nextDouble();
		 
		double addition = num1 + num2 ;
		double subtraction = num1 - num2;
		double multplication = num1 * num2;
		double division = num1 / num2 ;
		System.out.println("The additon is "+ addition + "the sub is " + subtraction + "the multipliaction is "+ multplication + "THE divison is "+ division );
		Scanner.close();

	}

}
