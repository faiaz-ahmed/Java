import java.util.Scanner;

public class Missing {
		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of the numbers: ");
		int n = input.nextInt();
		int [] num = new int[n];
		System.out.println("Enter the numbers: ");
		
		for (int i = 0; i < num.length; i++)
		{
			num[i] = input.nextInt();
		}
		
		int totalsum = ((n+1) * (n + 2)) / 2;
		int sum = 0; 
		
		for (int i = 0; i < num.length; i++)
		{
			sum += num[i];
		}
		
		int miss = totalsum - sum;
		
		System.out.print("missing element: " + miss);
			
		}
}
