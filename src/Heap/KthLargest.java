package Heap;

import java.util.PriorityQueue;

public class KthLargest {
    public static int largest(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};

        int n =largest(arr,2);
        System.out.println("Second Largest:"+n);
    }
}
