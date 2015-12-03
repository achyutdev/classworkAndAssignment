/*
 *Write a program to extract each digit from an int, in the reverse order. 
 *For example, if the int is 1542, the output shall be "2,4,5,1", with a comma separating the digits. 
 */

package questions;

import javax.swing.JOptionPane;

public class Question8 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
		int rem = 0;
		String std = "";

		while (num != 0) {
			rem = num % 10;
			if (num != 1)
				std += rem + ",";
			else
				std += rem + "";
			num/=10;
		}
		JOptionPane.showMessageDialog(null, "Result : "+ std);
	}

}
