package DoubleLinkedList;

public class ConvertArrayToDoubleLinkedList {
    public static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Node head = convert(arr);
        print(head);
    }
}
