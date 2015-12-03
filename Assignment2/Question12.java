/*
 * Print out the squares of the integers fall in the range input by the user.
 */
package questions;

import javax.swing.JOptionPane;

public class Question12 {

	public static void main(String[] args) {
		int start = Integer.parseInt(JOptionPane.showInputDialog("Enter Starting Number:"));
		int end = Integer.parseInt(JOptionPane.showInputDialog("Enter Ending Number:"));
		String msg ="";
		for(int i=start; i<end;i++){
			msg+=i + " square is "+(i*i)+"\n";
		}
		JOptionPane.showMessageDialog(null,msg);
	}
}

