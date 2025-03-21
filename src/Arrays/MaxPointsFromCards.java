package Arrays;

public class MaxPointsFromCards {
    public static int maximumPoint(int[] arr,int k){
        int n = arr.length;
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        for(int i=0;i<k;i++){
            leftSum += arr[i];
        }
        maxSum = leftSum;

        int rightIndex = n-1;
        for(int i=k-1;i>=0;i--){
            leftSum -= arr[i];
            rightSum += arr[rightIndex];
            rightIndex--;

            maxSum = Math.max(maxSum,leftSum+rightSum);

        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maximumPoint(arr,k));
    }
}
