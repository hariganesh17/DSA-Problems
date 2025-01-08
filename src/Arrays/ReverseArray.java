package Arrays;

import java.util.Arrays;

public class ReverseArray {
    //brute force - time:O(N) ; space-O(n)
    public static int[] reverse1(int[] arr){
        int n = arr.length;
        int[] reverseArray = new int[n];

        for(int i=0;i<n;i++){
            reverseArray[i] = arr[n-1-i];
        }
        return reverseArray;
    }
    //Optimized - time:O(N) ; space:O(1)
    public static int[] reverse2(int[] arr){
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
       int[] n =  reverse2(arr);
        System.out.println(Arrays.toString(n));
    }
}
