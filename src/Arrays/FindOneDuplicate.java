package Arrays;

import java.util.HashSet;

public class FindOneDuplicate {
    //Brute force
    public static int find1(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
    //Better
    public static int find2(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)) return num;
            set.add(num);
        }
        return -1;
    }

    //Optimized - tortoise and hare
    public static int find3(int[] arr){
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        fast = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args){
        int[] arr = {3,1,3,4,2};
        System.out.println(find3(arr));
    }
}
