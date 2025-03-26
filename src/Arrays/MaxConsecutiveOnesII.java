package Arrays;

public class MaxConsecutiveOnesII {
    public static int maximum(int [] arr){
        int left = 0;
        int right = 0;
        int zeros = 0;
        int maxlength = 0;

        while(right<arr.length){
            if(arr[right] == 0){
                zeros++;
            }
            while(zeros > 1){
                if(arr[left] == 0){
                    zeros--;
                }
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
            right++;
        }
        return maxlength;
    }
    public static void main(String[] args){
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println(maximum(arr));
    }
}
