package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals){
        //Sort intervals by start time
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals){
            // if result is empty or no overlap with last interval
            if(result.isEmpty() || result.get(result.size()-1)[1] < interval[0]){
                result.add(interval);
            }else{
                // overlap → merge by updating the end
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],interval[1]);

            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] merged = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
