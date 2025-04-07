package NumberOperation;

public class CountCubeSumPairs {
    public static int count(int n){
        int count =0;

        for(int a=1; a*a*a <= n; a++){
            int aCube = a*a*a;
            int bCube = n-aCube;

            int b =(int) Math.cbrt(bCube);

            if(b >= 0 && b*b*b == bCube){
                if(a == b || b==0){
                    count++;
                }else if(a < b){
                    count += 2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 9;
        System.out.println(count(n));
    }
}
