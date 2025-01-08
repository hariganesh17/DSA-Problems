package Arrays;

public class MissingNumber {
    // Brute force approach - linear search
    public static int number(int[] arr) {       //[1,2,3,4,5]
        int n = arr.length;
        for (int i = 1; i <= n; i++) {
           int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }

    //optimized -1

    public static int numbers(int[] arr){
        int n = arr.length + 1;
        int sum1 =  n * (n+1) / 2;
        int sum2 = 0;

        for(int i=0; i<arr.length; i++){
            sum2 += arr[i];
        }
        return (sum1-sum2);
    }

    //optimized -2 - better

    public static int numberss(int[] arr){          //[1,2,4,5]; N=5
         int n = arr.length-1;
         int xor1 = 0;
         int xor2 =  0;
         for (int i=0; i<n; i++){
             xor2 = xor2 ^ arr[i];
             xor1 = xor1 ^ (i+1);
         }
         xor1 = xor1 * n;
        return (xor1 ^ xor2);
    }
    public static int countSort(int[] arr){

        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int missing = numbers(arr);
        System.out.println(missing); // Expected output: 2
    }
}