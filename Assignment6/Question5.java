import javax.swing.JOptionPane;

class ArraySort{
    int i=0;
	
	public void bubblesort(int[] array){
		if(i==array.length-1)
			return;
		else{
			for (int j = 0; j < array.length; j++) {
				if(array[i]<array[j]){
					int tmp =array[i];
					array[i]=array[j];
					array[j]=tmp;
				}
			}
			i++;
			bubblesort(array);
		}
		
	}
}
public class Question5 {

	public static void main(String[] args) {
		int length = Integer.parseInt(JOptionPane.showInputDialog("Enter length of array :"));
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Array["+(i+1)+"]:"));
		}
		ArraySort sort = new ArraySort();
		sort.bubblesort(array);
		
		String msg ="";
		for (int i = 0; i < array.length; i++) {
			msg+=" "+array[i];
		}	
		JOptionPane.showMessageDialog(null, "Sorted array :"+msg);
	}

}
