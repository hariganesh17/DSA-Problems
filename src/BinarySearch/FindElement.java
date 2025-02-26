package BinarySearch;

public class FindElement {
    //tc - O(LogN) , sc-O(1)
    public static boolean find(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return true;
            } else if (target > arr[mid]) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 3;
        System.out.println(FindElement.find(arr,target));
    }
}
