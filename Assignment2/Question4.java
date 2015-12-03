package questions;

import java.util.Scanner;

//Print the given diamond shape using the nested loops.
public class Question4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no of rows:");
		int maxSize = input.nextInt();

		int row = (maxSize + 1) / 2;
		int space = row - 1;
		int urow = row;
		int lrow = row - 1;

		for (int i = 1; i <= urow; i++) {
			
			for (int j = space; j > 0; j--)
				System.out.print(" ");
			
			for (int k = 1; k <= (2 * i - 1); k++)
				System.out.print("*");
					
			System.out.println();
			space--;
		}
		space=1;
		for (int i = lrow; i >0; i--) {
			
			for (int j = space; j > 0; j--)
				System.out.print(" ");
			
			for (int k = (2 * i - 1); k >0 ; k--)
				System.out.print("*");
				
			System.out.println();
			space++;
		}
		
	}

}
