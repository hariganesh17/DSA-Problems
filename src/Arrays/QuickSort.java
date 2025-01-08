package Arrays;

import java.util.Arrays;

public class QuickSort{
	public static int partition(int[] arr,int low,int high){
		int pivot = arr[low];
		int i = low;
		int j = high;

		while(i < j){
			while(arr[i] <= pivot && i <= high-1){
				i++;
			}
			while(arr[j] > pivot && j >= low+1){
				j--;
			}
			if(i < j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;

		return j;
	}
	public static void sort(int[] arr,int low,int high){
		if(low < high){
			int partitionIndex = partition(arr,low,high);
			sort(arr,low,partitionIndex-1);
			sort(arr,partitionIndex+1,high);
		}
	}
	public static void main(String[] args){
		int[] arr = {2,4,1,3,6,3,5};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}