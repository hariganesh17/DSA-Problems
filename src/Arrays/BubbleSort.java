package Arrays;
import java.util.Arrays;

public class BubbleSort {
	//pushes the max to last by comparing adjacent elements
	public static void bubbleSorting(int[] arr) {
		int n =arr.length;

		for(int i=n-1; i>=1; i--) {
			for(int j=0; j<=i-1;j++){
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String [] args) {
		int[] arr = {3,2,5,4,1};
		bubbleSorting(arr);
		System.out.println(Arrays.toString(arr));

	}
}