/*
 * Write a program which ask the user if he wants to swap value Yes or No. If he press Yes ask him input 2 integer values 
 * and swap the values of these integers without using any third variable, your program must 
 * display the results before and after swapping and keep asking suer whether he wants swap or not.
 * 
 */

package questions;

import javax.swing.JOptionPane;

public class Question13 {

	public static void main(String[] args) {
		int a,b;
		do{
			String decision = JOptionPane.showInputDialog("Do you need to swap:");
			if(decision.toLowerCase().equals("yes")){
				a=Integer.parseInt(JOptionPane.showInputDialog("Enter first Num: "));
				b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Num: "));
				String msg = "Before swap a = "+a+" b = "+b;
	//			swapping without third variable
				a=a+b;
				b=a-b;
				a=a-b;
				msg+="\nAfter swap a = "+a+" b = "+b;
				JOptionPane.showMessageDialog(null, msg);
				
			}else if(decision.toLowerCase().equals("no")){
				JOptionPane.showMessageDialog(null, "Thank you for using me :)");
				break;
			}else{
				JOptionPane.showMessageDialog(null, "Invalid Input\nPlease enter yes or no");
			}
		}while(true);
	}

}
