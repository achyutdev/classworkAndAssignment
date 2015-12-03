/*//Write a program to find common elements in three sorted array?
//
//Examples:
//input1 = {1, 5, 10, 20, 40, 80}
//input2 = {6, 7, 20, 80, 100}
//input3 = {3, 4, 15, 20, 30, 70, 80, 120}
//Output: 20, 80
*/
package thirdAssignment;
import javax.swing.JOptionPane;

public class Question2 {
	public static void main(String[] args) {
		int[] input1 = new int[Integer.parseInt(JOptionPane.showInputDialog("Enter input 1 :"))];
		int[] input2 = new int[Integer.parseInt(JOptionPane.showInputDialog("Enter input 2 :"))];
		int[] input3 = new int[Integer.parseInt(JOptionPane.showInputDialog("Enter input 3 :"))];
		String commonNumber = "Common element are :";
		for (int i = 0; i < input1.length; i++) {
			input1[i] = Integer.parseInt(JOptionPane.showInputDialog("Input[" + i + "] :"));
		}
		for (int i = 0; i < input2.length; i++) {
			input2[i] = Integer.parseInt(JOptionPane.showInputDialog("Input[" + i + "] :"));
		}
		for (int i = 0; i < input3.length; i++) {
			input3[i] = Integer.parseInt(JOptionPane.showInputDialog("Input[" + i + "] :"));
		}

		for (int i = 0; i < input1.length; i++) {
			boolean checkFlag = false;
			for (int j = 0; j < input2.length; j++) {
				if (input1[i] == input2[j])
					checkFlag = true;
			}
			for (int j = 0; j < input3.length; j++) {
				if (checkFlag) {
					if (input1[i] == input3[j]) {
						commonNumber += " " + input1[i];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, commonNumber);
	}
}