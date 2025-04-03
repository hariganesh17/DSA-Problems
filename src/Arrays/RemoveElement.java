package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static int remove(int[] arr,int val){
        int k=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }
       // System.out.println(Arrays.toString(Arrays.copyOf(arr,k))); //use this if asked to print remaining array.
        return k;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5};
        System.out.println(remove(arr,5));
    }
}
