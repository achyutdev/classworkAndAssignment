/*
 * Ask the user for two integers, first a small one then a larger one. Multiply these two integers
 * by doing repeated addition. For example, if we were to obtain 3 and 5 from the user, 
 * then we would find their product by adding the larger one (5) three times.
 * 
 */
package questions;

import javax.swing.JOptionPane;

public class Question11 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number:"));
		int product=0;
		for(int i=0; i<num1;i++){
			product+=num2;
		}
		JOptionPane.showMessageDialog(null, "Product is : " + product);
	}

}
