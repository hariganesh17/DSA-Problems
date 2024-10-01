package Strings;

public class CheckPallindrome {
    public static boolean pallindrome(String str){

        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "mAdaM";
       boolean result =  pallindrome(str);
        System.out.println(result);
    }
}
