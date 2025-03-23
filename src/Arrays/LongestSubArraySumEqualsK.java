package Arrays;

import java.util.HashMap;

public class LongestSubArraySumEqualsK {
    //prefix sum
    public static int longestSubArrayLength(int[] arr,int k){
        int sum = 0;
        int maxLength = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(sum == k){
                maxLength = Math.max(maxLength,i+1);
            }
            int remaining = sum - k;
            if(map.containsKey(remaining)){
                int length = i - map.get(remaining);
                maxLength = Math.max(maxLength,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        System.out.println(longestSubArrayLength(arr,5));
    }
}
