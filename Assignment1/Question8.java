package assignmentFirst;

import java.util.Scanner;

/*
 * A car’s miles per gallon (MPG) can be calculated with the following formula:
MPG=Miles driven/Gallon of gas used
Write a program that takes number of miles and the gallon of gas as input. It should calculate 
the car’s MPG and display the results on the screen.
package assignmentFirst;
 */

public class Question8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter mile driven:");
		float milesDrive = input.nextFloat();
		System.out.print("Gallon of gas:");
		float gallonGas = input.nextFloat();

		System.out.println("MPG:" + milesDrive / gallonGas);
	}

}
