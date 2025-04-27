package BinarySearch;

public class PeakElement {
    public static int find(int[] nums){
        int n = nums.length;

        if(n == 1) return 0;                    //one element only
        if(nums[0] > nums[1]) return 0;         //first element itself peak
        if(nums[n-1] > nums[n-2]) return n-1;   //last element is peak

        int low = 1; int high = n-2;            //trim the search space

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;

            else if(nums[mid] > nums[mid-1]) low = mid+1;       //mid is at increasing slope

            else high = mid -1;                                // mid is at decreasing slope
        }
        return -1;
    }
    public static void main(String[] args){
        int [] nums = {1,2,1,3,5,6,4};
        System.out.println(find(nums));
    }
}
