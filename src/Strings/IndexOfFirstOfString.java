package Strings;

public class IndexOfFirstOfString {
    public static int strStr(String haystack,String needle){
        int m = haystack.length();
        int n = needle.length();

        for(int i=0;i<=m-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
