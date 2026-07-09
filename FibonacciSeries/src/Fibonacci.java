import java.util.Scanner;

public class Fibonacci {

	public static void FibonacciSeries(int n)
	{
		int[] series = new int[n];
		
		series[0] = 0;
		series[1] = 1;
		
		for (int i = 2; i < n; i++) 
		{
			series[i] = series[i - 1] + series[i - 2];
		}
		
		System.out.print("First " + n + "Fibonacci series: ");
		
		for (int i = 0; i < n; i++)
		{
			System.out.print(series[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int limit = input.nextInt();
		
		FibonacciSeries(limit);
	}

}
