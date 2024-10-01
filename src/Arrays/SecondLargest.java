package Arrays; // [2,4,3,1]

import java.util.Arrays;

public class SecondLargest {
	//brute force: time- O(N log N), N
	public static int second(int[] arr){
		int n = arr.length;

		Arrays.sort(arr);

		int largest = arr[n-1];
		int second = -1;

		for(int i=n-2;i>=0;i--){
			if(arr[i] != largest){
				second = arr[i];
				break;
			}
		}
		return second;
	}

	//better - O(2N)
	public static int secLargest(int[] arr){
		int n = arr.length;
		int largest = arr[0];
		int second = -1;

		for(int i=1;i<n;i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		for(int j=0;j<n;j++){
			if(arr[j] > second && arr[j] != largest){
				second = arr[j];
			}
		}
		return second;
	}
	//Optimizedm -O(N)
	public static int sLargest(int[] arr) {
		int n = arr.length;
		int largest = arr[0];
		int sLargest = Integer.MIN_VALUE;

		for (int i = 1; i < n; i++) {
			if (arr[i] > largest) {
				sLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > sLargest) {
				sLargest = arr[i];
			}
		}
		return sLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,3,1};
		
		int n =secLargest(arr);
		System.out.println("Second Largest:"+n);
	}
}