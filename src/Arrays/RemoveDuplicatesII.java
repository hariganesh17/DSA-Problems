package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesII {
    public static int remove(int[] arr){
        int k = 2;
        for(int i=2;i<arr.length;i++){
            if(arr[i] != arr[k-2]){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr,k)));
        return k;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3};
        System.out.println(remove(arr));
    }
}