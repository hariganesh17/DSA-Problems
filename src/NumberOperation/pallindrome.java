package NumberOperation;

public class pallindrome {
    public static boolean checkPallindrome(int n){
        int duplicate = n;
        int reverseNum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        if(reverseNum == duplicate){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n = 1212;
        System.out.println(checkPallindrome(n));
    }
}
