package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
       int[] n =  reverse(arr);
        System.out.println(Arrays.toString(n));
    }
}
