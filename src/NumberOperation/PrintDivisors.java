package NumberOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDivisors {
    public static List<Integer> divisors1(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        return list;
    }
    public static List<Integer> divisors2(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
           if(n % i == 0){
               list.add(i);
           }
           if(n/i != i){
               list.add(n/i);
           }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args){
        int n = 36;
        System.out.println(divisors2(n));
    }
}
