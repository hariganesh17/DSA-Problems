package Strings;

public class MaxPrefix {
        public static String prefix(String[] str){
            String first = str[0];
            for(int i=0;i<first.length();i++){
                char ch = first.charAt(i);
                for(String s : str){
                    if(i>= s.length() || s.charAt(i) != ch){
                        return first.substring(0,i);
                    }
                }
            }
            return first;
        }
        public static void main(String[] args){
            String[] s = {"flower","flow","flight"};
            String output =  prefix(s);
            System.out.println(output);
        }
}
