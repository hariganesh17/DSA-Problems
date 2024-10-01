package Strings;

public class VowelsCount {
    public static void count(String str){
        int vowels = 0;
        int consonants = 0;
        int space = 0;
        int n= str.length();
        str = str.toLowerCase();

        for(int i=0;i<n;i++){
           char ch = str.charAt(i);
           if( ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
               vowels++;
           } else if (ch >= 'a' && ch <= 'z') {
               consonants++;
           } else if (ch == ' ') {
               space++;
           }
        }
        System.out.println("vowels:"+vowels);
        System.out.println("consonants:"+consonants);
        System.out.println("space:"+space);
    }
    public static void main(String[] args){
        String str = "India won the match";
        count(str);

    }
}
