package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicates {
    //Brute force
    public static List<Integer> find(int[] arr){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,4,5,5,4};
        System.out.println(find(arr));
    }
}
