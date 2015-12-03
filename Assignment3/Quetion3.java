//Q#3)
//Given two sorted integer arrays A and B, merge B into A as one sorted array.

package thirdAssignment;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Quetion3 {

	public static void main(String[] args) {
		int[] A = new int[Integer.parseInt(JOptionPane.showInputDialog("Enter lenth of A array:"))];
		int[] B = new int[Integer.parseInt(JOptionPane.showInputDialog("Enter lenth of B array:"))];
		
		for (int i = 0; i < A.length; i++) {
			A[i]=Integer.parseInt(JOptionPane.showInputDialog("A[" + i +"] :"));
		}
		
		for (int i = 0; i < B.length; i++) {
			B[i]=Integer.parseInt(JOptionPane.showInputDialog("B[" + i +"] :"));
		}
		
		Arrays.sort(A);
		Arrays.sort(B);

		
		//java.lang.ArrayIndexOutOfBoundsException if it store in A. 
//		Creation new array with length A.length + B.length
		int[] C = new int[A.length + B.length];
		
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, A.length, B.length);
		
		
		for (int i : C) {
			System.out.println(C[i]);
		};

		
	}

}