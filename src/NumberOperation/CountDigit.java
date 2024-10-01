package NumberOperation;

public class CountDigit {
    public static int count(int n){
        int count = 0;
        while(n > 0){
          //  int lastDigit = n % 10;
            count += 1;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 4567;
        System.out.println(count(n));
    }
}
