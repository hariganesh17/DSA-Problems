package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //Brute force - Time-O(N^2), Space-O(1)
    public static int number(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i]){
                    count++;
                    }
                }
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }
    //Better Space-O(N),Time-O(N)
    public static int num(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){     //TC- O(N)
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);    //TC-LOG N
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){     //TC - O(N)
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    //Optimized -Time-O(N),space-O(1) Moor's voting algorithm--- algo based two variables- element and count
    public static int majority(int[] arr){
        int n= arr.length;
        int element = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }else if (arr[i] == element) count++;
            else count--;
        }
        int count1 =0;
       for(int i=0;i<n;i++){
           if(arr[i] == element) count1++;
       }
       if(count1 > (n/2)) return element;
       return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,3,2,2};
       int num = num(arr);
        System.out.println(num);
    }
}
