package question5;

public class ArraySorting {
	
//	merge sorting 
	public static int[] mergeSort(int [] array) {
        if (array.length <= 1) {
            return array;
        }
        
        int[]left = new int[array.length / 2];
        int[] right = new int[array.length -left.length];
        
        System.arraycopy(array, 0,left, 0,left.length);
        System.arraycopy(array,left.length, right, 0, right.length);
        
    
        mergeSort(left);
        mergeSort(right);
        
        merge(left, right, array);
        return array;
    }

    private static void merge(int[]left, int[] right, int [] result) {
        
        int x = 0;
        int y = 0;
        
        int j = 0;
        while (x <left.length && y < right.length) {
            if (left[x] < right[y]) {
                result[j] =left[x];
                x++;
                } else {
                result[j] = right[y];
                y++;
            }
            j++;
        }
        System.arraycopy(left, x, result, j,left.length - x);
        System.arraycopy(right, y, result, j, right.length - y);
    }
    
// Bubble sorting

	public static void BubbleSort(int[] array) {

		int temp;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[i]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}

			}

		}
	}
	
//	insertionSort
	
	public static void InsertionSort(int[] array) {
	
		int i;
		int  value;
		

		for (int j = 1; j < array.length; j++)
		{
			 value = array[j];
			for (i = j - 1; (i >= 0) && (array[i] <  value); i--)
			{
				array[i + 1] = array[i];
			}
			array[i + 1] =  value;
		}
	}

}
