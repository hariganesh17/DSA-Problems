package Arrays;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix){
        int n =matrix.length;

        //transpose matrix - ie, row to col & vice versa
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse row
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    private static void reverse(int[] row){
        int left = 0;
        int right = row.length-1;

        while(left < right){
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}