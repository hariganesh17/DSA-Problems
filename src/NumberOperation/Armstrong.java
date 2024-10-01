package NumberOperation;

public class Armstrong {

//    An Armstrong number is a number (with 'k' digits) such that the sum of its
//    digits raised to 'kth' power is equal to the number itself.
//    For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

    public static boolean checkArmstrong(int num){
        double sum = 0;
        int k = String.valueOf(num).length();
        int duplicate = num;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit,k);
            num = num / 10;
        }
        if(sum == duplicate){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int num =103;
        System.out.println(checkArmstrong(num));
    }
}
