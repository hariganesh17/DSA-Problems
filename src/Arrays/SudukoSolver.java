package Arrays;

public class SudukoSolver {
    public static void suduko(char[][] borad){
        solve(borad);
    }
    public static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j] = c;

                            if(solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        printBoard(board);
        return true;
    }
    private static boolean isValid(char[][] borad,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(borad[row][i] == c) return false;

            if(borad[i][col] == c) return false;

            int boxRow = 3*(row/3)+i/3;
            int boxCol = 3*(col/3)+i%3;

            if(borad[boxRow][boxCol] == c) return false;
        }
        return true;
    }
    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solve(board);
    }
}
