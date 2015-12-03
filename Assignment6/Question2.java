import java.util.Scanner;

/*
 * Write a program which has recursive function that can pick the smallest 
 * character (As per its ASCI/UNICODE value)
 */

class SmallCharPicker {
	private static char character=10000;

	public char smallchar(String s) {
		if (s.length() == 0)
			return character;
		if ((int) s.charAt(0) < (int) character) {
			SmallCharPicker.character = s.charAt(0);
			return smallchar(s.substring(1));
		}
		return smallchar(s.substring(1));

	}
}

public class Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = input.nextLine();
		
		SmallCharPicker sm = new SmallCharPicker();
		System.out.println("The smallest char is "+sm.smallchar(s));

	}

}
