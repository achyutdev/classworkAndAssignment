/*
 * Write your own mathFunction class which can perform following functions
Sum of integer values e.g sumInteger(int Array[]) means the function takes list as arguments
Mean of integer values
Highest value among list
Lowest value among list
Sort the list 
Calculate the area of circle i.e.  where pi=3.14 which can never be changed in program

 */

package question1;

import javax.swing.JOptionPane;

public class Question1 {
	public static void main(String args[]){
		
//		creating new object
		MathFunction intArray = new MathFunction();
		
//		Display array
		JOptionPane.showMessageDialog(null, "Array : "+intArray.displayArray());
		
//		sum of all integer value
		JOptionPane.showMessageDialog(null, "Sum : "+intArray.sumInteger());
		
//		mean of integer array
		JOptionPane.showMessageDialog(null, "Mean : "+intArray.mean());

//		Highest value
		JOptionPane.showMessageDialog(null, "Highest value : "+intArray.highestValue());
		
//		lowest value
		JOptionPane.showMessageDialog(null, "Lowest value : "+intArray.lowestValue());
		
//		sorting
		intArray.sort();
		
//		Display array
		JOptionPane.showMessageDialog(null, "After sorting : "+intArray.displayArray());
		
//		circle area
		int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter radius of circle:"));
		JOptionPane.showMessageDialog(null, "Circle area : "+intArray.circleArea(radius));
		
	}
}
