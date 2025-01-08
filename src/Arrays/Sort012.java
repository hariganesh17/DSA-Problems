package Arrays;

import java.util.Arrays;

public class Sort012 {
    //Brute Force - any sorting (if mergesort) - time O(N logN) ; space O(N)

    //Better - time:O(N) + O(N) = O(2N) = O(N); space: O(1)
    public static int[] sorting(int[] arr){
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<n;i++){
            if(arr[i] == 0) count0 ++;
            else if(arr[i] ==1) count1 ++;
            else count2++;
        }
        for(int i=0;i<count0;i++){
            arr[i] = 0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i] = 1;
        }
        for(int i=count0+count1;i<n;i++){
            arr[i] = 2;
        }
        return arr;
    }
    //dutch national flag algorithm -time O(N), space O(1)
    public static int[] sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,0,2,2,1,1,0,0,2};
        int[] output = sorting(arr);
        System.out.println(Arrays.toString(output));
    }
}
