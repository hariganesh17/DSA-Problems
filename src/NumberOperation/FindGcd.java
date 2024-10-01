package NumberOperation;

public class FindGcd {
//tc O(min(n1,n2)
    public static int findGcd1(int n1, int n2){
        int hcf = 1;
        for(int i=1;i<=n1;i++){   //for n1=11,n2=13 - i<=n1 okay but if n1=13,n2=11 then there is no point checking after 11 so to avoid this use Math.min
            if(n1%i == 0 && n2%i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
    //Optimized - Euclidean Algorithm -- time:O(log min(n1,n2))
    public static int findGcd2(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            return n2;
        }
        return n1;
    }
    public static void main(String[] args){
        int n1=20;
        int n2=15;
        System.out.println(findGcd1(n1,n2));
    }
}
