package BinarySearch;

public class SearchInRotatedSortedArrayI {
    public static int search(int[] nums,int target){
        int n = nums.length;
        int low =0;
        int high = n-1;

        while(low <=high){
            int mid =(low + high)/2;

            if(nums[mid] == target) return mid;

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
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums,3));
    }
}
