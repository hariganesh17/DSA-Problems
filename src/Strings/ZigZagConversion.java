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
        boolean goingDown = false;

        for(char c : s.toCharArray()){
            rows[currentRow].append(c);

            // Change direction if we hit top or bottom
            if(currentRow == 0 || currentRow == numsRows-1){
                goingDown = !goingDown;     // reverse the direction
            }
            // Move to next row based on direction
            currentRow += goingDown ? 1 : -1;
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
