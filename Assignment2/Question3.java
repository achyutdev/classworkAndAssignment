package questions;

import javax.swing.JOptionPane;

/*
 * Number is palindrom or not?
 * 
 */
public class Question3 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number: "));
		int rem, revNum =0, i=1, oriNum=num;
		while(num!=0){
			rem=num%10;
			revNum+=rem*i;
			num/=10;
			i*=10;
		}
		if(oriNum==revNum)
			JOptionPane.showMessageDialog(null, "Palindram");
		else 
			JOptionPane.showMessageDialog(null, "Not Palindram");
	}

}
