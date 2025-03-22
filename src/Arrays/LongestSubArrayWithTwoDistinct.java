package Arrays;

import java.util.HashMap;

public class LongestSubArrayWithTwoDistinct {
    public static int totalElements(int[] arr){
        int left = 0;
        int right = 0;
        int maxLength = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(right < arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while(map.size() > 2){
                map.put(arr[left],map.get(arr[left]) - 1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,2,2};
        System.out.println(totalElements(arr));
    }
}
