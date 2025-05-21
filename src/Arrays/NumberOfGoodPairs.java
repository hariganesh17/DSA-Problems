package Arrays;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public static int identicalPairs(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;

        for(int num : nums){
            if(map.containsKey(num)){
                count += map.get(num);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1,1,3};
        System.out.println(identicalPairs(nums));
    }
}
