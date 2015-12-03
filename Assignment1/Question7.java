/*
 * A software company recently surveyed 15000 of its customers and found that approximately 18% of
 *  those surveyed purchase one of more energy drinks per week. Of those customers who purchase energy
 *   drinks, approximately 58% of them interested in citrus flavored drinks. Write a program that displays following:
Approximate numbers of customers in the survey who purchase one or more energy drinks per week
Approximate number of customers in the survey who prefer citrus flavored energy drinks
 */
package assignmentFirst;

import javax.swing.JOptionPane;

public class Question7 {

	public static void main(String[] args) {
		int totalCustomer = 15000;
		double moreDrinkBuyer = 18;
		double citrusInterestedBuyer = 58;

		JOptionPane.showMessageDialog(null,
				"Number of customers who buy one or more drink per week:" + (int) (totalCustomer * 0.18));
		JOptionPane.showMessageDialog(null,
				"Number of customers who interested in citrus drink:" + (int) (totalCustomer * 0.58));
	}

}
