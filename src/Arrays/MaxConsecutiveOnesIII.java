package Arrays;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] arr,int k){
        int left = 0;
        int right = 0;
        int zeros = 0;
        int maxLength = 0;

        while(right < arr.length){
            if(arr[right] == 0){
                zeros++;
            }
            while(zeros > k){
                if(arr[left] == 0){
                    zeros--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr,2));
    }
}
