package Arrays;

import java.util.*;

public class PairSum {
    //Brute
    public static List<List<Integer>> findPairs1(int[] arr,int target){
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    result.add(Arrays.asList(arr[i],arr[j]));
                }
            }
        }
        return result;
    }
    //optimized
    public static List<List<Integer>> findPairs2(int[] arr,int target){
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int num : arr){
            int value = target - num;
            if(set.contains(value)){
                result.add(Arrays.asList(value,num));
            }
            set.add(num);
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {2, 7, 4, 3, 5, 1, 6};
        System.out.println(findPairs1(arr,7));
    }
}
