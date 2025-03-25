package Strings;

public class MinimumWindowSubSequence {
    //Characters must appear in the same order as t but do not need to be consecutive.
    public static String subString(String s, String t){
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        String minSubSequence = "";

        while(right < s.length()){
            int tIndex = 0;

            //Go forward
            while(right < s.length()){
                if(s.charAt(right) == t.charAt(tIndex)){
                    tIndex++;
                }
                if(tIndex == t.length()) break;
                right++;
            }
            if(right == s.length()) break;

            //Go Backward
            int left = right;
            tIndex = t.length()-1;

            while(left >= 0){
                if(s.charAt(left) == t.charAt(tIndex)){
                    tIndex--;
                }
                if(tIndex < 0) break;
                left--;
            }
            //now find the length
            if(right - left + 1 < minLength){
                minLength = right - left +1;
                minSubSequence = s.substring(left, right+1);
            }
            //repeat the steps
            right = left +1;
        }
        return minSubSequence;
    }
    public static void main(String[] args){
        String s = "abcdebdde";
        String t = "bde";
        System.out.println(subString(s,t));
    }
}
