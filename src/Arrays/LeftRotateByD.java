package Arrays;

import java.util.Arrays;

public class LeftRotateByD {
    //Brute force - time:O(3N)=O(N); space:O(N)
    public static int[] rotate(int[] arr,int k){
        int n = arr.length;

        if(n ==0){
            return arr;
        }

        k = k % n;
        if(k > n){
            return arr;
        }
        int [] temp = new int[k];

        //store k elements to temp
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }

        //swap the rest elements to front
        for(int i=0;i<n-k;i++){
            arr[i] = arr[i+k];
        }

        //now fill the remaining with temp elements
        //int j = 0;
        for(int i=n-k;i<n;i++){
         //   arr[i] = temp[j];
         //   j++;
            arr[i] = temp[i-n+k];
        }
        return arr;
    }

    //Optimized - time:O(N) ; space O(1) - reverse approach
    public static int[] rotate1(int[] arr,int k){
        int n = arr.length;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

        return arr;
    }
    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] result = rotate1(arr,2);
        System.out.println(Arrays.toString(result));
    }
}
