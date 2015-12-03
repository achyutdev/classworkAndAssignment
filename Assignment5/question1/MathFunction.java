package question1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MathFunction {
	
	private int[] array;
	private int sum=0;
	final double PI = 3.14;
	
	
	public MathFunction(){
		 array= new int[Integer.parseInt(JOptionPane.showInputDialog("Enter array length:"))];
		 for (int i = 0; i < array.length; i++) {
			this.array[i]=Integer.parseInt(JOptionPane.showInputDialog("Array["+(i+1)+"]:"));
		}
	}
	
	public int sumInteger(){
		int sum =0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		this.sum=sum;
		return sum;
	}
	
	public double mean(){
		return sum/(array.length);
	}
	
	public int highestValue(){
		int highest = array[0];
		for (int i = 0; i < array.length; i++) {
			if(highest<array[i]){
				highest=array[i];
			}
		}
		return highest;
	}
	
	public int lowestValue(){
		int lowest = array[0];
		for (int i = 0; i < array.length; i++) {
			if(lowest>array[i]){
				lowest=array[i];
			}
		}
		return lowest;
	}
	
	public void sort(){
		Arrays.sort(array);
	}
	
	public String displayArray(){
		String msg = "";
		for (int i = 0; i < array.length; i++) {
			msg+="  "+array[i];
		}
		return msg;
	}
	
	public double circleArea(double radius){
		return PI*Math.pow(radius, 2);
	}
	
}
