package NumberOperation;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int a = 0;
        int b = 1;

        for(int i=2;i <= n;i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }

    //Climbing stairs
    public static int climb(int n){
        if(n < 2) return n;
        int first = 1;
        int second = 2;

        for(int i=3;i<=n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String[] args) {
        int n = 4;
       // System.out.println(n + "th Fibonacci number is: " + fibonacci(n));
        System.out.println(climb(n));
    }
}
