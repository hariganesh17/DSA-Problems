package Strings;

public class ReverseWords {
    public static String reverseWords(String s){
        // Step 1: Remove extra spaces (leading, trailing, multiple spaces)
        StringBuilder sb = removeExtraSpaces(s);
        char[] chars = sb.toString().toCharArray();

        // Step 2: Reverse the entire string (so words come in reverse order)
        reverse(chars);

        //Step 3: Reverse each word to correct their characters
        reverseEachWord(chars);

        return new String(chars);
    }
    private static StringBuilder removeExtraSpaces(String s){
        int i=0;
        int n=s.length();

        StringBuilder sb = new StringBuilder();

        //skip leading spaces
        while(i < n && s.charAt(i) == ' ') i++;

        while(i < n){
            //add non space char
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            //add only one space - if prev char isn't already space
            else if(sb.charAt(sb.length()-1) != ' '){
                sb.append(' ');
            }
            i++;
        }
        // remove tailing spaces
        if(sb.length() > 0 && sb.charAt(sb.length()-1) == ' '){
            sb.deleteCharAt(sb.length()-1);
        }

        return sb;
    }
    private static void reverse(char[] str){
        int start = 0;
        int end = str.length -1;

        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    private static void reverseEachWord(char[] str){
        int n = str.length;
        int start = 0;

        while(start < n){
            int end = start;

            // Move end pointer to the end of the word
            while(end < n && str[end] != ' ') end++;

            // Reverse current word
            int left = start;
            int right = end-1;

            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
            // Move to the next word
            start = end+1;
        }
    }
    public static void main(String[] args){
        String s = "  the   sky is  blue  ";
        System.out.println(reverseWords(s));
    }
}
