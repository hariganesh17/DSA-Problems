package Arrays;

public class CountNiceSubArrays {
    public static int subArrays(int[] arr,int k){
        return count(arr,k) - count(arr,k-1);
    }
    public static int count(int[] arr,int k){
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while(right < arr.length){
            sum += arr[right] % 2;

            while(sum > k){
                sum -= arr[left] % 2;
                left++;
            }
            count += (right - left + 1);

            right++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,1,1};
        System.out.println(subArrays(arr,3));
    }
}
