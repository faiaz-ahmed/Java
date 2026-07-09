package calculation;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter two numbers for multiplication and division: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		double multi = a * b;
		double division = a / b;
		
		System.out.println("Multiplication of those two numbers are: " + multi);
		System.out.print("Division of those two numbers are: " + division);
		
	}

}
