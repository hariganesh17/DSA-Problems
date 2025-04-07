package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonSubsequence {
    // recurssive apprach -- but for large data set it will throw TLE so optimize by DP
    public static int longest(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        return solve(s1,s2,n,m);
    }
    private static int solve(String s1,String s2,int i,int j){
        if(i==0 || j == 0) return 0;

        if(s1.charAt(i-1) == s2.charAt(j-1)){
            return 1 + solve(s1,s2,i-1,j-1);
        }else{
            return Math.max(solve(s1,s2,i-1,j),solve(s1,s2,i,j-1));
        }
    }

    //optimized - DP - memoization -- we can further optimize it using tabulation and then space optimization using prev and current pointer
    public static int longest1(String s,String t){
        int n = s.length();
        int m = t.length();

        //Create DP table initialized with -1
        int[][] dp = new int[n+1][m+1];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve1(s,t,n,m,dp);
    }
    public static int solve1(String s,String t,int i, int j,int[][]dp){
        if( i == 0 || j == 0) return 0;

        //// Return already computed value
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i-1) == t.charAt(j-1)){
            dp[i][j] =  1 + solve1(s,t,i-1,j-1,dp);
        }else{
            dp[i][j] = Math.max(solve1(s,t,i-1,j,dp),solve1(s,t,i,j-1,dp));
        }
        return dp[i][j];
    }
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "ac";
        System.out.println(longest1(s1,s2));
    }
}
