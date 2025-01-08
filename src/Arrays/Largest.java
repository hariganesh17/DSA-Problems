package Arrays;

public class Largest {
	public static int largest(int[] arr){
		int n = arr.length;
		int largest = arr[0];
		for(int i=1;i<n;i++){
			if(arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}
	public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,1};
    	int num = largest(arr);
    	System.out.println("Largest number: "+num);
    }
}