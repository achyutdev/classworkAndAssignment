/*
 * There is an array with every element repeated twice except one. Find that element?
 * 
 */

package thirdAssignment;

public class Question1 {

	public static void main(String[] args) {
		int[] array = {12,23,12,32,23};
		int single = 0;
		for (int i = 0; i < array.length; i++) {
			boolean flag =true;
			for (int j = 0; j < array.length; j++) {
				if(i!=j){
					if(array[i]==array[j]){
						flag=false;
						break;
					}else
						continue;
				}
				single =array[j];
			}
			if(flag)
				System.out.println("Single element is :" + single);
		}
	}

}
