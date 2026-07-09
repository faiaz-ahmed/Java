package loop;

import java.util.Scanner;


public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to find it's divisors: ");
		int num = obj.nextInt();
		
		System.out.print("Divisors of " + num + " are: ");
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
				System.out.print(i + " ");
		}
	}

}
