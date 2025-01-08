package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
	//Brute force - time:O(3n) = O(n) ; space:O(n) - using arraylist
	public static int[] moveZeros1(int[] nums){
		int n = nums.length;

		ArrayList<Integer> temp = new ArrayList<>();

		for(int i=0;i<n;i++){
			if(nums[i] != 0){
				temp.add(nums[i]);
			}
		}

		for(int i=0;i<temp.size();i++){
			nums[i] = temp.get(i);
		}

		for(int i=temp.size();i<n;i++){
			nums[i] = 0;
		}
		return nums;
	}
	//Optimized - time:O(N) ; space:O(1)
	public static int[] move(int[] arr){
		int n = arr.length;
		int j=-1;

		// First loop to find the first zero
		for(int i=0;i<n;i++){
			if(arr[i] == 0){
				j = i;
				break;
			}
		}

		// If no zeros were found, there's no work to do
		if(j==-1){
			return arr;
		}

		// Second loop to move non-zero elements forward
		for(int i=j+1;i<n;i++){
			if(arr[i] != 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				// Increment j to the next zero position
				j++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };
		int[] result = move(arr);
		System.out.println(Arrays.toString(result));
	}
}
