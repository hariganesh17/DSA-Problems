package Arrays;

import java.util.Arrays;

public class dummy{
	public static int [] Bubble(int[] arr){
		int n = arr.length;
		for(int i=n-1;i>=1;i--){
			for(int j=0;j<i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args){
		int[] arr = {2,4,1,5,3};
		int[] n = Bubble(arr);
		System.out.println(Arrays.toString(n));
	}
}