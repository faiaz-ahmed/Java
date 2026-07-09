import java.util.Scanner;

public class AveragePercantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[6];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 6 numbers to find their average: ");
		
		for (int i = 0; i < 6; i++)
		{
			numbers[i] = input.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 0; i < 6; i++)
		{
			sum += numbers[i];
		}
		
		double average = (double) sum / 6;
		
		int count = 0;
		
		for (int i = 0; i < 6; i++)
		{
			if (numbers[i] > average)
				count++;
		}
		
		double percantage = (count * 100.00 ) / 6 ;
		
		System.out.println("Average of the numbers are: " + average);
		System.out.print("Numbers that are above the average's percantage is " + percantage + "%");
	}

}
