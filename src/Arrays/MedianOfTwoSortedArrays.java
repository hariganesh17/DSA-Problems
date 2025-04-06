package Arrays;

public class MedianOfTwoSortedArrays {
    public static double median(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;

        int index2 = n/2; //if even - med =index2
        int index1 = index2-1; //if odd - med = index1+index/2

        int index1num = -1;
        int index2num = -1;

        int count =0;

        int i=0;
        int j=0;

        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j]){
                if(count == index1) index1num = nums1[i];
                if(count == index2) index2num = nums1[i];
                count++;
                i++;
            }else{
                if(count == index1) index1num = nums2[j];
                if(count == index2) index2num = nums2[j];
                count++;
                j++;
            }
        }
        while(i<n1){
            if(count == index1) index1num = nums1[i];
            if(count == index2) index2num = nums1[i];
            count++;
            i++;
        }
        while(j<n2){
            if(count == index1) index1num = nums2[j];
            if(count == index2) index2num = nums2[j];
            count++;
            j++;
        }
        if(n % 2 == 1) return index2num;

        return (index2num + index1num)/2.0;
    }
    public static void main(String[] args){
        int[] nums1={1,2};
        int[] nums2={3,4};

        System.out.println(median(nums1,nums2));
    }
}
