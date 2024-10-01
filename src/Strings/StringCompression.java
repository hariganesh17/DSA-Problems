package Strings;

public class StringCompression {
    public static String compressString(String s){
        String str = s.toLowerCase();
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                compressed.append(str.charAt(i-1)); // if not same append the previous char into string builder
                compressed.append(count);
                count = 1;      //reset
            }
        }
        compressed.append(str.charAt(str.length()-1));      //include the last char since it wasnt handled in loop.
        compressed.append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
    public static void main(String[] args){
        String s = "aabbbbccd";
        String compressedString = compressString(s);
        System.out.println(compressedString);
    }
}
