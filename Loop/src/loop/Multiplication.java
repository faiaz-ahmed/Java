package loop;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("  1  2  3  4  5  6  7  8  9"); 
		for(int i = 1; i < 11; i++) {
			System.out.print(i + "|");
			for (int j = 1; j < 10; j++) {
				
				System.out.print( i*j + " ");
			}
			System.out.print("\n");
		}
	}

}
