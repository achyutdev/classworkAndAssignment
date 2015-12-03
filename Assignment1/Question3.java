package assignmentFirst;

import javax.swing.JOptionPane;

/*A bag of cookies hold 40 cookies. The calorie information on the bag claims that
 *  there are 10 servings in the bag and that each serving has 300 calories. Write 
 *  a program that let user enter the number of cookies he/she ate and then reports 
 *  the number of calories consumed.
 */

public class Question3 {
	public static void main(String[] args) {
		int totalCookiesAte = 0;
		float caloriesInEach = 300 / 4;
		totalCookiesAte = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of cookies you have ate :"));
		JOptionPane.showMessageDialog(null, "You eat " + caloriesInEach * totalCookiesAte + " calories cookies");

	}
}
