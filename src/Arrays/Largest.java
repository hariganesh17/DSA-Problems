package Arrays;

public class Largest {
	// approach brute firstly ie, sort the array and print the last element which should be largest - tc O(N log N)
	// tc-O(N):
    public static int largest(int [] arr) {
    	int n =arr.length;
    	int largest = arr[0];
    	
    	for(int i=1; i<n; i++) {
    		if(arr[i] > largest) {
    			largest = arr[i];
    		}
    	}
		return largest;
    }

//    public static int largest(int n, int[] arr) {
//        int max = Integer.MIN_VALUE;
//
//        for (int element : arr) {
//            if (element > max)
//                max = element;
//        }
//        return max;
//    }

	public static void main(String[] args) {
    	
    	int[] arr = {23,22,21,99,24};
    	
    	int num = largest(arr);
    
    	System.out.println("Largest number: "+num);
    }
}