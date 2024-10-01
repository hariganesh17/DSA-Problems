package Arrays;

public class RightRotate {
	
	//Using reverse approach
	
		public void rotateArray(int[] nums,int k) {
			int n = nums.length;
			k = k % n;
			
			reverse(nums, 0, n-1);
			reverse(nums, 0, k-1);
			reverse(nums, k, n-1);
		}
		
		public void reverse(int[] nums, int start, int end) {
			while(start < end) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start ++;
				end --;
			}
		}
	
	//using additional memory approach
	
	public void rotate(int[] nums,int k) {
		int n = nums.length;
		k = k % n;
		int[] rotatedArray = new int[n];
		
		for(int i=0;i<k;i++) {
			 rotatedArray[i] = nums[n-k+i];
		}
		
		for(int i=k;i<n;i++) {
		rotatedArray[i] = nums[i-k];
		}
		
		for(int i=0;i<n;i++) {
			nums[i] = rotatedArray[i];
		}
	}
	
	public static void main(String[] args) {
		RightRotate obj = new RightRotate();
		
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		obj.rotate(nums, k);
		//obj.rotateArray(nums, k);
		
		for(int num : nums) {
			System.out.println("num: "+num);
		}
		
		
	}
}
