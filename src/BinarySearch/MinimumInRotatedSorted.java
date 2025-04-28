package BinarySearch;

public class MinimumInRotatedSorted {
    public static int findMin(int[] nums){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;

            //find min in left sorted
            if(nums[low] <= nums[mid]){
                //low will be min in sorted so update
                ans = Math.min(ans,nums[low]);
                //remove this entire part
                low = mid+1;
            }
            //find min in right sorted
            else{
                //mid will be min in sorted so update
                ans = Math.min(ans,nums[mid]);
                //remove this entire part
                high = mid-1;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
