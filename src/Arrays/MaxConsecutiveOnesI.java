package Arrays;

public class MaxConsecutiveOnesI {
    public static int maximum(int[] arr){
        int onesCount =0;
        int maxOnes = 0;

        for(int num : arr){
            if(num == 1){
                onesCount++;
                maxOnes = Math.max(maxOnes,onesCount);
            }else{
                onesCount = 0;
            }
        }
        return maxOnes;
    }
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maximum(arr));
    }
}
