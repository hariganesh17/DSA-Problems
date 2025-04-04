package Arrays;

public class Candy {
    public static int total(int[] ratings){
        int n = ratings.length;
        int sum = 1;
        int i =1;

        while(i < n) {
            //flat slope
            if (ratings[i] == ratings[i - 1]){
                sum += 1;
                i++;
                continue;
            }

            //Increasing slope
            int peak = 1;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak += 1;
                sum += peak;
                i++;
            }

            //decreasing slope
            int down = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                down += 1;
                sum += down;
                i++;
            }
            if(down > 0 && peak <= down){
                sum += down - peak +1;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int [] ratings = {1,2,3,2,1};
        System.out.println(total(ratings));
    }
}
