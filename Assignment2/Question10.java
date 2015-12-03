/*
 * Write a Java program that allows the user to choose the correct answer of a question using Switch statement. 
 * See the example below: What is the correct way to declare a variable to store an integer value in Java?
a. int 1x=10;
b. int x=10;
c. float x=10.0f;
d. string x="10";
Enter your choice: c
 * 
 */
package questions;

import javax.swing.JOptionPane;

public class Question10 {

	public static void main(String[] args) {
		String var = JOptionPane.showInputDialog("What is the correct way to declare a variable to store an integer value in Java?\n"
				+ "a. int 1x=10 \nb. int x=10 \nc. float x=10.0f \nd. string x=\"10\";" );
		switch (var) {
		case "a":
		case "c":
		case "d":
			JOptionPane.showMessageDialog(null, "Wrong");
			break;
		case "b":
			JOptionPane.showMessageDialog(null, "Right");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
			break;
		}
	}

}
