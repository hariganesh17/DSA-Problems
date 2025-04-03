package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesI {
	//Brute force - use set(only unique) - time: O(N) + O(N) : space - O(N)

	public static int[] remove(int[] arr){
		Set<Integer> set = new HashSet<>();
		for(int num : arr){
			set.add(num);
		}
		int [] result = new int[set.size()];
		int index = 0;

		for(int num : set){
			result[index++] = num;
		}
		return result;
	}

	//optimized - use 2pointer - time:O(N) ; space:O(1)
	 public static int[] removeDuplicates(int arr[]) {
		 int i=0;
		 for(int j=1;j<arr.length;j++) {
			 if(arr[j] != arr[i]) {			//if not equal then it is unique
				 arr[i+1] = arr[j];			// take place infront of me
				 i++;
			 }
		 }
		return Arrays.copyOf(arr,i+1);
	 }
	 //same optimized
	public static int remove1(int[] nums){
		int k = 1;
		for(int i=1;i<nums.length;i++){
			if(nums[i] != nums[k-1]){
				nums[k] = nums[i];
				k++;
			}
		}
		//System.out.println(Arrays.toString(Arrays.copyOf(nums,k)));
		return k;
	}
	 
	 public static void main(String[] args) {
		 int[] nums = {1,1,1,2,2,3,3,3,4,5,5};
		 //int[] n = removeDuplicates(arr);
		// System.out.println(Arrays.toString(n));
		 System.out.println(remove1(nums));
		 }
}