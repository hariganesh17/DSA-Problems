package NumberOperation;

public class PowerOfNumber {
    public static double power(double x,int n){
        if(x == 0 && n == 0) return 1;

        double ans = 1;
        long m = n;
        if(m < 0){
            x = 1.0/x;
            m = -m;
        }
        while(m > 0){
            if(m%2 == 1){
                ans = ans * x;
                n = n-1;
            }else{
                m = m/2;
                x = x*x;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        long x = 2;
        int n = 5;
        System.out.println(power(x,n));
    }
}
