package Arrays;

import java.util.Arrays;

public class InsertionSort {
	//take an element and place it in correct position
	public static int[] insert(int[] arr) {
		int n = arr.length;
		for(int i=0;i<=n-1;i++){
			int j =i;
			while(j>0 && arr[j-1] > arr[j]){
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;

				j--;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {3,2,5,4,1};
		int [] n  = insert(arr);
		System.out.println(Arrays.toString(n));

	}
}