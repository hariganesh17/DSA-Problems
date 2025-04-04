package Arrays;

public class JumpGameII {
    //range based solution
    public static int jump(int[] arr){
        int jumps =0;
        int l = 0;
        int r = 0;

        while(r < arr.length-1){
            int farthest = 0;
            for(int i=l;i<=r;i++){
                farthest = Math.max(farthest,i+arr[i]);
            }
            jumps++;
            l = r+1;
            r = farthest;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,0,1,4};
        System.out.println(jump(arr));
    }
}
