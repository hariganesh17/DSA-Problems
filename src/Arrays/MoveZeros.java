package Arrays;

public class MoveZeros {
	public void moveZeros(int[] nums) {
		int n = nums.length;
		int nonZeroIndex = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				nums[nonZeroIndex] = nums[i];
				nonZeroIndex++;
			}
		}

		for (int i = nonZeroIndex; i < n; i++) {
			nums[i] = 0;
		}
	}

	public static void main(String[] args) {

		MoveZeros obj = new MoveZeros();

		int[] nums = { 0, 1, 0, 3, 12 };
		obj.moveZeros(nums);

		for (int num : nums) {
			System.out.println("num: " + num);
		}
	}
}
