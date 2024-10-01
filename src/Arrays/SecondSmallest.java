package Arrays;

public class SecondSmallest {
	public static int sSmallest(int[] arr) {
		int n = arr.length;
		int smallest = arr[0];
		int sSmallest = Integer.MAX_VALUE;
		
		for(int i=1;i<n;i++) {
			if(arr[i] < smallest) {
				sSmallest = smallest;
				smallest =arr[i];
			}else if(arr[i] != smallest && arr[i] < sSmallest) {
				sSmallest = arr[i];
			}
		}
			
		return sSmallest;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,1};
		
		int n =SecondSmallest.sSmallest(arr);
		System.out.println("Second Smallest:"+n);
	}
}
