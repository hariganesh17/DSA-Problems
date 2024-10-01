package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    //brute force - nested loop
    public static int[] twoSum1(int[] nums,int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    //optimized - hashMap
    public static int[] twoSum2(int[] arr,int targt){
        int[] answer = new int[2];
        answer[0] = answer[1] = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int value = targt - arr[i];
            if(map.containsKey(value)){
                answer[0] = map.get(value);
                answer[1] = i;
                return answer;
                }
            map.put(arr[i],i);
        }
        return answer;
    }
    //without Map -- 2 pointer
    public static String twoSum3(int[] array,int tarrget){
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int sum = array[left] + array[right];
            if(sum == tarrget){
                return "YES";
            }else if(sum < tarrget) left ++;
                else right --;
        }
        return "NO";
    }
    public static void main(String[] args){
        int[] array = {2,7,11,15};
        int tarrget = 9;
       String result = twoSum3(array,tarrget);
        System.out.println(result);
    }
}