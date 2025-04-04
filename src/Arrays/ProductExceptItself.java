package Arrays;

import java.util.Arrays;

public class ProductExceptItself {
    //For each element at index i, we want:

    //answer[i] = product of all elements to the left of i
    //          * product of all elements to the right of i

    public static int[] product(int[] arr){
        int n = arr.length;  //[2,3,4]
        int[] ans = new int[n];

        //left product
        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * arr[i-1]; //[1,2,6]
        }

        //right product
        int right =1;
        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i] * right;
            right *= arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }
}
