/*Write a program that computes your initials from your full name and displays them.
 *  For example Davis Paul Richard is a name your program should display DPR.
 */

package questions;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		String fullName = JOptionPane.showInputDialog("Enter you full name :");
		int charIndex	= 0;
		String shortName="" + fullName.charAt(charIndex);
		
		while (charIndex >= 0){
			if(charIndex !=0)	
				shortName+=fullName.charAt(charIndex+1);
		    charIndex = fullName.indexOf(' ',charIndex+1);
		}
		
		JOptionPane.showMessageDialog(null, "Short Name : " + shortName);
	}

}
