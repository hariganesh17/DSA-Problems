package Arrays;

public class MaxSubArrayProduct {
    //brute force : tc- O(N^3)
    public static int max(int[] arr){
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int product = 1;
                for(int k=i;k<=j;k++){
                    product *= arr[k];
                    maximum = Math.max(maximum,product);
                }
            }
        }
        return maximum;
    }
    //Better - O(N^2)
    public static int max1(int[] arr){
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int product = 1;
            for(int j=i;j<n;j++){
                product *= arr[j];
                maximum = Math.max(maximum,product);
            }
        }
        return maximum;
    }
    //Optimized - O(N)
    public static int max2(int[] arr){
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for(int i=0;i<n;i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= arr[i];
            suffix *= arr[n-i-1];

            maximum = Math.max(maximum,Math.max(prefix,suffix));
        }
        return maximum;
    }
    public static void main(String[] args){
        int[] arr =  {1,2,-3,0,-4,-5};
        int result =  max2(arr);
        System.out.println(result);
    }
}
