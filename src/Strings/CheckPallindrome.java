package Strings;

public class CheckPallindrome {
    //Brute Force - time:O(N) +O(N) = O(N) ; space: O(N)
    public static boolean checkPallindrome(String string){
        String reverseString = "";

        for(int i=string.length()-1;i>=0;i--){
            reverseString += string.charAt(i);
        }
        if(string.equals(reverseString)){
            return true;
        }
        return false;
    }
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
        String str = "madam";
       boolean result =  pallindrome(str);
        System.out.println(result);
    }
}
