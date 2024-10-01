package Strings;

public class MaxFrequency {
    public static void maxOccuringChar(String s){
            int [] freq = new int[26];
            String str = s.toLowerCase();
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i) - 'a']++;
            }
            int maxFrequency = 0;
            char maxChar = ' ';
            for(int i=0;i<26;i++){
                if(freq[i] > maxFrequency){
                    maxFrequency = freq[i];
                    maxChar =(char)(i+'a');
                }
            }
        System.out.println("Char with max occurance:"+maxChar+" & "+"Max occurance:"+maxFrequency);
    }
    public static void main(String[] args){
        String s = "apple";
        maxOccuringChar(s);
    }
}
