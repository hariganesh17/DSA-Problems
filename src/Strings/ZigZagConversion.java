package Strings;

public class ZigZagConversion {
    public static String convert(String s,int numsRows){
        if(numsRows == 1 || s.length() <= numsRows) return s;

        //Create an array of StringBuilders, one for each row
        StringBuilder[] rows = new StringBuilder[numsRows];

        for(int i=0;i<numsRows;i++){
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;             // track current row index
        int direction = 1;              // 1-moving down ; -1 - moving up

        for(char c : s.toCharArray()){
            rows[currentRow].append(c);

            // Change direction if we hit top
            if(currentRow == 0) {
                direction = 1;          // go down
            }
            // Change direction if we hit bottom
            else if(currentRow == numsRows-1) {
                direction = -1;         // go up
            }
            currentRow += direction;
        }
        //Combine all rows into one result
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        System.out.println(convert(s,3));
    }
}
