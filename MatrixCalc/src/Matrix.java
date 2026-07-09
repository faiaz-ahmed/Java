
public class Matrix {

	public static void main(String[] args) {
		
		int[][] matrix  = { {3, 4 ,9} , {2,9,11}, {4,6,0} };
		
		for (int i = 0; i < 3; i++)
		{
			int sum = 0;
			for (int j = 0; j < 3; j++)
			{
				sum += matrix[i][j];
			}
			System.out.println("Sum of the " + (i+1) + " row is " + sum);
		}
		
		System.out.print("\n");
		
		for (int j = 0; j < 3; j++)
		{
			int sum = 0;
			for (int i = 0; i < 3; i++)
			{
				sum += matrix[i][j];
			}
			System.out.println("Sum of the " + (j+1) + " Column is " + sum);
		}
		
		System.out.print("\n");
		
		int sum = 0;
		for (int i = 0; i < 3; i++)
		{
				sum += matrix[i][i];
			
		}
		System.out.println("Sum of the Main Diagonal is " + sum);
		
		
		int sum2 = 0;
		for (int i = 0; i < 3; i++)
		{
				sum2 += matrix[i][2 - i];
			
		}
		System.out.println("Sum of the Anti-Diagonal is " + sum2);
		
		
	}

}
