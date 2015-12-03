//Q#4)
//Read in 10 ints from the keyboard, and store them in an array. Find the position (or index) of the maximum
//and minimum values in the array, and swap them (move the biggest element to the position of the smallest, 
//and move the smallest element to the position of the biggest).

package thirdAssignment;

import javax.swing.JOptionPane;

public class Question4 {
	public static void main(String[] agrs){
		int[] intArray = new int[10];
		for (int i = 0; i < 10; i++) {
			intArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Array["+i+"]"));
		}
		int maxValue=intArray[0];
		int minValue=intArray[0];
		int maxPos = 0;
		int minPos = 0;
		
		String msg1 ="Before Swap :";
		String msg2 = "After Swap :";
		
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]>maxValue){
				maxValue=intArray[i];
				maxPos=i;
			}
			if(intArray[i]<minValue){
				minValue=intArray[i];
				minPos=i;
			}
			
			msg1 += " " + intArray[i];
		}
		
		JOptionPane.showMessageDialog(null, "Max Value is "+ maxValue +"\n Min value is "+ minValue);
		
		intArray[minPos]=maxValue;
		intArray[maxPos]=minValue;
		
		for (int i = 0; i < intArray.length; i++) {
			msg2 += " " + intArray[i];
		}		
		
		JOptionPane.showMessageDialog(null, msg1 +"\n"+msg2);
	}
}
