package Arrays;

public class CheckArrayIsSorted {
	//non descending order
	public static int check (int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i] >= arr[i-1]) {

			}else return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = CheckArrayIsSorted.check(arr);
		System.out.println(n);
	}
}
