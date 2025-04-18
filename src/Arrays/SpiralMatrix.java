package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> print(int[][] matrix){

        List<Integer> ans = new ArrayList<>();
        int n = matrix.length; //no.of rows
        int m = matrix[0].length; //no of col

        int top = 0, left = 0, bottom = n-1, right = m-1;

        while(top <= bottom && left <= right){
            //left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //right to left
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom to top
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        List<Integer> ans = print(matrix);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
