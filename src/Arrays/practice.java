package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice {
    private static int maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args){
       int[] arr= {1,2,2,2,3};
       int out = maxSum(arr);
        System.out.println(out);
    }
}
