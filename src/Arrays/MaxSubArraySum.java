package Arrays;

public class MaxSubArraySum {
    //Brute force -time O(N^3) space- O(1)
    public static int max(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){      //sub array - from i to j
                    sum += arr[k];
                }
                    if(sum > max){
                        max = sum;
                    }
            }
        }
        return max;
    }
    //Better---time-O(N^2) space - O(1)
    public static int maxx(int[] arr){
        int n = arr.length;       //  {2,3,1,4,6,4,2}
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    // optimized - time O(N), space O(1) : kadane's algorithm
    public static void maximum(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        //print sub array
        int start = 0;
        int tempStart = 0;
        int end = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
                //print
                start = tempStart;
                end = i;
            }
            if(sum < 0){
                sum = 0;
                tempStart = i+1;
            }
        }
        System.out.println("Max Sum: "+max);
        System.out.println("Sub array");

        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //Optimized - same kadane's algo which also handles all -ve array (above doesn't handle)
    public static int maxSum(int[] arr){
        int max = arr[0];
        int sum = arr[0];

        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));
    }
}
