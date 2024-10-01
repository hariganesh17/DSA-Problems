package Strings;

public class FirstUniqueCharacter {
    //Brute force
    public static char firstUniqueChar1(String s){
        String str = s.toLowerCase();
        for(int i=0;i<str.length();i++){
            boolean found = true;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found){
                return str.charAt(i);
            }
        }
        return '0';
    }
    //optimized
    public static char firstUniqueChar2(String s){
        String str = s.toLowerCase();
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i) - 'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i) - 'a'] == 1){
                return str.charAt(i);
            }
        }

        return'0';
    }
    public static void main(String[] args){
        String s =  "hheelloo";
        System.out.println(firstUniqueChar2(s));
    }
}
