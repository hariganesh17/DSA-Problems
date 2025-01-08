package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static int[] find(int [] arr){
        int n = arr.length;

        int index = -1;
        for(int i = n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr,0,n-1);
            return arr;
        }

        for(int i=n-1;i>=0;i--){
            if(arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        reverse(arr,index+1,n-1);

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
    public static void main(String [] args){
        int [] arr = {2,1,5,4,3,0,0};
        int [] result = find(arr);
        System.out.println(Arrays.toString(result));
    }
}
