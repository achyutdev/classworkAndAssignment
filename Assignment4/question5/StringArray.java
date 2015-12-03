package question5;

import javax.swing.JOptionPane;

public class StringArray {
	private String[] stringValues;
	
	public StringArray(int range){
		stringValues =new String[range];
	}
	
	public void setArray(){
		for (int i = 0; i < stringValues.length; i++) {
			stringValues[i] = JOptionPane.showInputDialog("Type string " +(i+1)+" :");
		}
	}
	
	public String showLargeString(){
		int stringLength =0,index = 0;
		for (int i = 0; i < stringValues.length; i++) {
			if(stringValues[i].length()>stringLength){
				stringLength=stringValues.length;
				index=i;
			}
		}
		return stringValues[index];
	}
}
