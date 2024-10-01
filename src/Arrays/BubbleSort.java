package Arrays;

import java.util.Arrays;

public class BubbleSort {			//[3,2,5,4,1]		[1,2,3,4,5]
	public static int[] bubbleSorting(int[] arr) {
		int n =arr.length;
		
		for(int i=n-1; i>=1; i--) {
			for(int j=0; j<i;j++){
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String [] args) {
		int[] arr = {3,2,5,4,1};
		
		int[] n = bubbleSorting(arr);
		System.out.println(Arrays.toString(n));

		}
}