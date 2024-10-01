package Arrays;
public class SelectionSort{
	public static void select(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] <= arr[minIndex]) {
					minIndex = j;
				}
			}
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {3,2,1,4,5,1};
		
		SelectionSort.select(arr);
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
}