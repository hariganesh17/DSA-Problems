package Arrays;

public class BinarySubArraySum {
    public static int count(int[] arr,int goal){
        return subArray(arr,goal) - subArray(arr,goal-1);
    }
   public static int subArray(int[] arr,int goal){
        if(goal < 0) return 0;
       int left = 0;
       int right = 0;
       int sum =0;
       int count = 0;

       while(right < arr.length){
           sum += arr[right];
           while(sum > goal){
               sum -= arr[left];
               left++;
           }
           count += (right - left + 1);
           right++;
       }
       return count;
   }
   public static void main(String[] args){
        int[] arr = {1,0,1,0,1};
       System.out.println(count(arr,2));
   }
}
