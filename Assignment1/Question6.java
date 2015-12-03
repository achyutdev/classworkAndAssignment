/*
 * A cookie recipe calls for the following ingredients:
1.5 Cups of sugar
1 Cup of butter
2.75 Cups of flour
The recipe produces 48 cookies with these amounts of ingredients. Write a program that asks user how many cookies 
he/she wants to make and the display the number of cups of ingredients needed for the specified number of cookies.
 */
package assignmentFirst;

import javax.swing.JOptionPane;

public class Question6 {

	public static void main(String[] args) {
		
//		requirement to make one cookie
		double cupOfSugar = 1.5/48;
		double cupOfButter= 1.0/48;
		double cupOfFlour = 2.75/48;
		
		int numOfCookies = Integer.parseInt(JOptionPane.showInputDialog("Enter number of cookies you want to make:"));
		JOptionPane.showInputDialog("You need following things :\n  "+((float) cupOfSugar*numOfCookies)+" Cup of Sugar\n  "
									+((float) cupOfButter*numOfCookies)+" Cup of Butter\n  "
									+((float) cupOfFlour*numOfCookies) +" Cup of Flour" );
	}

}
