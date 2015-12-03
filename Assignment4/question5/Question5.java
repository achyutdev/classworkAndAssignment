/*
 * Create a class StringArray which takes the string values from user as class data and than determine 
 * which of the String value is greater.Like is there are 3 string values “This”, “is”,”FPP Course”, 
 * program must have one method showLargeString() which returns value “FPP Course”. Obviously there will 
 * be getter and setter.
 * 
 */

package question5;

import javax.swing.JOptionPane;

public class Question5 {
	public static void main(String[] args){
		int numberOfString =Integer.parseInt(JOptionPane.showInputDialog("Enter total string :"));
		
		StringArray newStringArray = new StringArray(numberOfString);
//		Setting string in the instance variable.
		newStringArray.setArray();
		
//		printing largest string 
		
		JOptionPane.showMessageDialog(null, "Longest string is : " + newStringArray.showLargeString());
	}

}
