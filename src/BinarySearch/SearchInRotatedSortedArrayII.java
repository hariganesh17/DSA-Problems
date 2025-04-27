package BinarySearch;

public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] nums,int target){
        int n = nums.length;
        int low =0;
        int high = n-1;

        while(low <=high){
            int mid =(low + high)/2;

            if(nums[mid] == target) return true;

            //if duplicate move next until distinct
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            //search in left sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <=  nums[mid]){
                    //eliminate left half
                    high = mid-1;
                }else{
                    //eliminate right half
                    low = mid+1;
                }
            }
            //search in right sorted
            else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(search(nums,3));
    }
}
