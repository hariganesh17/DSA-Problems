package Arrays;

import java.util.Arrays;

public class SelectionSort{
	//select minimums and swap
	public static int[] select(int[] arr) {
		int n = arr.length;

		for(int i=0;i<=n-2;i++) {
			int minIndex = i;

			for(int j=i+1; j<=n-1; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int [] arr = {3,2,1,4,5,1};

		int[] n = select(arr);
		System.out.println(Arrays.toString(n));
	}
}