package name_input;

import java.util.Scanner;

public class InputName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = name.nextLine();
		
		System.out.println("Your name is: " + str);
	}

}
