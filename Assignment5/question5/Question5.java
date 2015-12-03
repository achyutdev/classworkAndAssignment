/*
 * Create a class arraySorting which can perform following functions on array list stored at its data member:
mergeSort
BubbleSort
insertionSort
Depend on user options compare which of sort is performing well as per number of passes. 
 */


package question5;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		
		int length = Integer.parseInt(JOptionPane.showInputDialog("Enter length of array :"));
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Array["+(i+1)+"]:"));
		}
		int selection = Integer.parseInt(JOptionPane.showInputDialog("Enter prefer sorting method:\ntype 1 for merge sorting\ntype 2 for bubble sorting\ntype 3 for insertion sorting" ));
		
		ArraySorting sort = new ArraySorting();
		if(selection==1){
			sort.mergeSort(array);
		}else if(selection==2){
			sort.BubbleSort(array);
		}else if(selection==3){
			sort.InsertionSort(array);
		}else{
			JOptionPane.showMessageDialog(null, "Invalid Selection");
		}
		String msg ="";
		for (int i = 0; i < array.length; i++) {
			msg+=" "+array[i];
		}	
		JOptionPane.showMessageDialog(null, "Sorted array :"+msg);
	}

}
