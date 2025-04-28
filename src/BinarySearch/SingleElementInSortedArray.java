package BinarySearch;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums){
        int n = nums.length;

        if(n ==1) return nums[0];                                           //if only one element
        if(nums[0] != nums[1]) return nums[0];                              //check first element
        if(nums[n-1] != nums[n-2]) return nums[n-1];                        //check last element

        //trimming down search space if not then we have to do check if mid+1 & mid -1 crossing boundary in every time
        int low = 1;
        int high = n-2;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            //if mid is at left half
            if((mid % 2 == 1  && nums[mid] == nums[mid-1])                  //standing at odd index (even,odd(mid))
                    || (mid % 2 == 0 && nums[mid] == nums[mid+1])){         //standing at even index (even(mid),odd)
                low = mid+1;
            }
            //if mid is at right half
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
}
