package Arrays;

public class ThirdLargest {
    public static int third(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MAX_VALUE;

        for(int num : arr){
            if(num > first){
                third = second;
                second = first;
                first = num;
            }else if(num < first && num > second){
                third = second;
                second = num;
            }else if(num < second && num > third){
                third = num;
            }
        }
        return third == Integer.MIN_VALUE ? -1 : third ;
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8};
        System.out.println(third(arr));
    }
}
