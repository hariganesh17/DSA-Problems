package Strings;

public class ReverseString {
    //brute force-- time and space: O(N)
    public static void reverse(char[] str){
        int n = str.length;
        char[] reverseStr = new char[n];

        for(int i=0;i<n;i++){
            reverseStr[i] = str[n-1-i];
        }
        for(int i=0;i<n;i++){
            str[i] = reverseStr[i];
        }
    }

    //Optimized-- two pointer: time-O(N), space-O(1)
    public static void reverseStr(char[] str){
        int n = str.length;
        int start = 0;
        int end = n-1;

        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        char[] str = {'H','E','L','L','O'};
        reverseStr(str);
        System.out.println(str);
    }
}
