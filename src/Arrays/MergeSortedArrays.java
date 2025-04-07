package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    // ‘ARR1’ has a size equal to ‘M’ + ‘N’ such that ‘ARR1’ has enough space to add all the elements of ‘ARR2’ in ‘ARR1’
    public static void merge(int[] nums1,int m, int[] nums2,int n){
        int length = nums1.length;
        int end = length-1;

        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[end] = nums2[n-1];
                n--;
            }else{
                nums1[end] = nums1[m-1];
                m--;
            }
            end--;
        }
        while(n > 0){
            nums1[end] = nums2[n-1];
            n--;
            end--;
        }
    }
    public static void main(String[] args){
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
