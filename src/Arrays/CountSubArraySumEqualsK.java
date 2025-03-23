package Arrays;

import java.util.HashMap;

public class CountSubArraySumEqualsK {
    public static int count(int[] arr,int k){
        int prefixSum = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            int remaining = prefixSum - k;
            count += map.getOrDefault(remaining,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr ={3,1,2,4};
        System.out.println(count(arr,6));
    }
}
