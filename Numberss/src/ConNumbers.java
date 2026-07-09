import java.util.Scanner;

public class ConNumbers {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the numbers: ");
		int range = input.nextInt();
		int[] numbers = new int[range];
		
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < range; i++)
		{
			numbers[i] = input.nextInt();
		}
		
		
		int count = 1;
		for(int i = 1; i < range; i++)
		{
			if (numbers[i] == numbers[i - 1]) {
				count++;
			}
				else {
					
				
			if (count >= 3) {
				System.out.println(numbers[i - 1]);
		}
		count = 1;
				}
		}
	}}
		
	


