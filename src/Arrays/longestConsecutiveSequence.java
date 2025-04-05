package Arrays;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static int longConsecutive(int[] nums){
        int longest = 0;

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            // only start sequence if `num - 1` is not in set
            if(!set.contains(num-1)){
                int currentNum = num;
                int count = 1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args){
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longConsecutive(nums));
    }
}
