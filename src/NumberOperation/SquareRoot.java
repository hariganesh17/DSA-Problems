package NumberOperation;

public class SquareRoot {
    public static int find(int n){
        if( n <2) return 0;

        int left = 1;
        int right = n/2;

        while(left <= right){
            int mid = left + (right - left)/2;

            long square =(long) mid * mid;

            if(square == n) return mid;

            else if(square < n) left = mid+1;

            else right = mid-1;
        }
        return right;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(find(16));
    }
}
