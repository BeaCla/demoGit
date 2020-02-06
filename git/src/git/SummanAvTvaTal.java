package git;

import java.util.Scanner;

public class SummanAvTvaTal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a number:");
		int numberOne = input.nextInt();
		
		System.out.println("Write one more number:");
		int numberTwo = input.nextInt();
		
		System.out.println("Sum of your numbers are: " + (numberOne + numberTwo));
		
		
	}

}
