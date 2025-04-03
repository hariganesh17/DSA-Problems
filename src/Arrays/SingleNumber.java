package Arrays;

public class SingleNumber {
    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    public static int getNumber(int[] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3};
        System.out.println(getNumber(arr));
    }
}
