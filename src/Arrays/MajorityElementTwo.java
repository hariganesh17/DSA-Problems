package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementTwo {
    //Brute force
    public static List<Integer> majority1(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

       for(int i=0;i<n;i++){
           int count1 = 0;
           for(int j=0;j<n;j++){
               if(arr[j] == arr[i]){
                   count1++;
               }
           }
           if(count1 > n/3 && !list.contains(arr[i])){
               list.add(arr[i]);
           }
       }
       return list;
    }
    //Better
    public static List<Integer> majority2(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            int value = map.getOrDefault(num,0);
            map.put(num,value+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    //Extended moor's voting algo
    public static List<Integer> Majority3(int[] arr){
        int n = arr.length;
        int element1 = 0 , element2 = 0;
        int count1 = 0, count2 = 0;

        //select elements
        for(int num : arr){
            if(count1 == 0 && element2 != num){
                count1 = 1;
                element1 = num;
            } if(count2 == 0 && element1 != num){
                count2 = 1;
                element2 = num;
            }else if(num == element1){
                count1++;
            }else if(num == element2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        //Verify elements
        count1 = 0;
        count2 = 0;
        for(int num : arr){
            if(num == element1) count1++;
            else if(num ==  element2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        if(count1 > n/3) result.add(element1);
        if(count2 > n/3) result.add(element2);

        return result;
    }
    public static void main(String[] args){

        int[] arr = {1,1,1,1,1,3,3,3,3,3,5};
        List<Integer> result = majority2(arr);
        System.out.println(result);
    }
}
