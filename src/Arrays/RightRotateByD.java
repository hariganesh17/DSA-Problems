package Arrays;

import java.util.Arrays;

public class RightRotateByD {
	//Brute force - time - O(3N) = O(N) ; space - O(N)
	public static int[] rotate(int[] arr,int k){
		int n = arr.length;
		k = k % n;

		//Store the last k elements in temp
		int[] temp = new int[n];
		for(int i=0;i<k;i++){
			temp[i] = arr[n-k+i];
		}

		//store the remaining elements after temp
		for(int i=k;i<n;i++){
			temp[i] = arr[i-k];
		}

		//Assign it back to original array
		for(int i=0;i<n;i++){
			arr[i] = temp[i];
		}
			return arr;
	}

	//Optimized - time: O(3N) = O(N) ; space : O(1)
	public static int[] rotate1(int[] arr,int k){
		int n =arr.length;

		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);

		return arr;
	}

	public static void reverse(int[] arr,int start,int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int [] result = rotate1(arr,2);
		System.out.println(Arrays.toString(result));
	}
}

