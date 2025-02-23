package NumberOperation;

public class ReverseDigit {
    public static int reverse(int n) {
        int reverseNum = 0;
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        return reverseNum;
    }
    public static void main(String[] args){
        int n =234;
        System.out.println(reverse(n));
    }
}

