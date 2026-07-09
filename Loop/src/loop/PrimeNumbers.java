package loop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find if they are prime numbers: ");
		int num = input.nextInt();
		
		if (num == 1 || num == 2)
			System.out.print("This is a prime number.");
		
		for (int i = 2; i < num; i ++)
		{
			if (num % i == 0) {
				System.out.print("This is not a prime number.");
			break;
			}
		}
		System.out.print("This is a prime number.");
		
		
		
	}

}
