package Strings;

public class LengthOfLastWord {
    public static int length(String s){
        int length = 0;
        int i = s.length()-1;

        while(i >=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args){
        String s = "Hello world";
        System.out.println(length(s));
    }
}
