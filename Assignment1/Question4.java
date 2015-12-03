/*
 * Write a program which asks user to input number of male and female students registered in the lass. 
 * Than program must display percentage of male and female students in the class.

 */
package assignmentFirst;

import javax.swing.JOptionPane;

public class Question4 {

	public static void main(String[] args) {
		int male, female;
		male = Integer.parseInt(JOptionPane.showInputDialog("Enter no of male:"));
		female = Integer.parseInt(JOptionPane.showInputDialog("Enter no of female:"));

		double perMale = (double) male / (male + female) * 100;
		double perFemale = (double) female / (female + male) * 100;

		// percentage of male and female
		JOptionPane.showMessageDialog(null,
				"Male percentage :" + perMale + "%\n" + "Female percentage :" + perFemale + "%");
	}

}
