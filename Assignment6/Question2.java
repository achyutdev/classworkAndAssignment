import java.util.Scanner;

/*
 * Write a program which has recursive function that can pick the smallest 
 * character (As per its ASCI/UNICODE value)
 */

class SmallCharPicker {
	public char smallchar(String s) {
		if (s.length() == 1)
			return s.charAt(0);
		else {
			char ch = s.charAt(0);
			char c = smallchar(s.substring(1));
			return (c < ch) ? c : ch;
		}
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
