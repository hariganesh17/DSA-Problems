package Strings;

public class StringCompressionIII {
    public static String compress(String s){
        StringBuilder comp = new StringBuilder();
        int i =0;

        while(i<s.length()){
            char currentChar = s.charAt(i);
            int count = 0;

            while(i < s.length() && s.charAt(i) == currentChar && count < 9){
                i++;
                count++;
            }
            comp.append(currentChar).append(count);
        }
        return comp.toString();
    }
    public static void main(String[] args){
        String s = "aaaaaaaaaaaaaabb";
        System.out.println(compress(s));
    }
}
