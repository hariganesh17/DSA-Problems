package Arrays;

import java.util.HashMap;

public class SubArrayWithKDistinct {
    public static int distinctSubArray(int[] arr,int k){
        return  count(arr,k) - count(arr,k-1);
    }
    public static int count(int[] arr,int k){
        int left = 0;
        int right = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(right < arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while(map.size() > k){
                map.put(arr[left],map.get(arr[left])-1);

                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            count += (right - left + 1);

            right++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,2,3};
        System.out.println(distinctSubArray(arr,2));
    }
}
