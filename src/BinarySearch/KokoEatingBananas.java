package BinarySearch;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles,int h){
        int low = 1;
        int high = findMax(piles);

        while(low <= high){
            int mid = (low + high)/2;
            int totalHour = calculateTotalHour(piles,mid);

            if(totalHour <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int findMax(int[] piles){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        return max;
    }
    public static int calculateTotalHour(int[] piles,int hourly){
        int totalHour = 0;

        for(int i=0;i<piles.length;i++){
            totalHour += Math.ceil((double)piles[i] / (double)hourly);
        }
        return totalHour;
    }
    public static void main(String[] args){
        int[] piles = {30,11,23,4,20};
        System.out.println(minEatingSpeed(piles,5));
    }
}
