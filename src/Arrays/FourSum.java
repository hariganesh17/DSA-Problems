package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            //skip i duplicate
            if(i != 0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1;j<nums.length;j++){
                //skip j duplicate
                if(j != i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = nums.length-1;

                while(k < l){
                    int sum = nums[i]+nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum < target){
                        k++;
                    }else if(sum > target){
                        l--;
                    }else{
                        List<Integer> quad = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(quad);
                        k++;
                        l--;

                        //skip k and l duplicate
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums,0));
    }
}
