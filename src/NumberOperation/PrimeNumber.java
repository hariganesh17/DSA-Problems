package NumberOperation;

public class PrimeNumber {
    public static boolean checkPrime1(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                count += 1;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
    public static boolean checkPrime2(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                count+=1;

                if(n/i != i){
                    count+=1;
                }
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n = 8;
        System.out.println(checkPrime2(n));
    }
}
