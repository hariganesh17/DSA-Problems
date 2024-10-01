package Arrays;

import java.util.Arrays;

public class Sort012 {
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
        int[] output = sort(arr);
        System.out.println(Arrays.toString(output));
    }
}
