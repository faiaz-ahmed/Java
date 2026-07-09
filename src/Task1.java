import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers of element for the array: ");
		int n = input.nextInt();
		
		int [] arr = new int[n];
        System.out.println("Enter the values of the array: ");
        
        for (int i = 0; i < n; i++)
        {
             arr[i] = input.nextInt();
        }
        
        System.out.println("Target?: ");
        int target = input.nextInt();
        
        int left = 0;
        int currsum = 0;
        
        System.out.println("Output:");
        
        for (int right = 0; right < arr.length; right++)
        {
        	currsum += arr[right];
        	
        	while (currsum > target && left <= right)
        	{
        		currsum -= arr[left];
        		left++;
        	}
        	
        	if (currsum == target)
        	{
        		System.out.print("Left index: " + (left + 1));
        		System.out.print(" ");
        		System.out.println("Right index: " + (right + 1));
        		break;
        	}
        	
        }
        if (left == -1)
        System.out.println("-1");
	}

}
