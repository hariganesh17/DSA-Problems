package Strings;

public class FrequencyCount {
    public static void FrequencyOfChar(String s){
        int [] freq = new int[26];
        String str = s.toLowerCase();
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i] != 0){
                System.out.print((char)(i+'a') + "" +freq[i] + " ");
            }
        }
    }
    public static void main(String [] args){
        String s = "takeuforward";
        FrequencyOfChar(s);
    }
}
