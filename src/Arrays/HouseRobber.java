package Arrays;

//maximum Sum of  non adjacent elemets
public class HouseRobber {
    //Intution - if u decided to pick one(3),  u cant pick prev2(2), u can pick only prev1(1)  .. vice versa  //[1,2,3]

    /*dp[n];
    dp[0] = a[0];
    int negative = 0;
    for(int i=1;i<n;i++){
        take = a[ind] +dp[i-2];  // if i=1; then 1-2 =-1; so we use base codn only add if i > 1;
        notTake = 0+ dp[i-1];
        dp[i] = max(take,not take);
    }*/


    public static int rob(int[] nums){
        int n = nums.length;
        int prev1 = nums[0]; //
        int prev2 = 0;

        for(int i=1;i<n;i++){
            int take = nums[i];
            if(i > 1) take += prev2;

            int notTake = 0 + prev1;

            int current = Math.max(take,notTake);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(nums);
    }
}
