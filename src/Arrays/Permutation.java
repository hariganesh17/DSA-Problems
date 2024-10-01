package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private static void recursion(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recursion(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    private static List<List<Integer>> permute (int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recursion(nums,ans,ds,freq);
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        for(List<Integer> op : result){
            System.out.println(op);
        }
    }
}
