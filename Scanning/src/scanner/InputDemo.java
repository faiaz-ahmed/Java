package scanner;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter two numbers for calculation: ");
		double a = obj.nextDouble();
		double b = obj.nextDouble();
		
		double add = a + b;
		double sub = a - b;
		
		System.out.println("Addidtion = " + add + " Subtraction = " + sub);

	}

}
