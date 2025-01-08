package Arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static int[] rotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];

        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args){
        int [] arr = {2,3,4,5,1};
        int[] result = rotate(arr);
        System.out.println(Arrays.toString(result));
    }
}
