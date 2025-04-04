package Arrays;

public class JumpGameI {
    public static boolean canJump(int[] arr){
        int maxIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(i > maxIndex) return false;  //If i haven't reached here, then it can't jump from here
            maxIndex = Math.max(maxIndex,i+arr[i]);
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
}
