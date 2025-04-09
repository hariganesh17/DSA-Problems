package Arrays;

/*
there are n kids with candies. You are given an integer array candies,
where each candies[i] represents the number of candies the ith kid has, and
an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest number
of candies among all the kids, or false otherwise.*/


import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> checkCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();

        int greatest = candies[0];

        for(int i=1;i<candies.length;i++){
            if(candies[i] > greatest) greatest = candies[i];
        }
        for(int i=0;i<candies.length;i++){
            result.add(candies[i] + extraCandies >= greatest);
        }
        return result;
    }
    public static void main(String[] args){
        int[] candies ={2,3,5,1,3};
        System.out.println(checkCandies(candies,3));
    }
}
