package Strings;

public class Anagram {
    public static boolean isValid(String s,String t){
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i)- 'a']--;
        }
        for(int value : count){
            if(value != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s ="anagram";
        String t ="nagaram";

        System.out.println(isValid(s,t));
    }
}
