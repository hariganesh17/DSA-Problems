package DoubleLinkedList;

import java.util.Stack;

public class ReverseDoubleLinkedList {
    //Brute force - tc- O(N) ; space - O(N) + O(N) = O(2N) = O(N)
    public static Node reverse1(Node head){
        Node temp = head;
        Stack<Integer> stack = new Stack<>();

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }

    //Optimized - tc - O(N) ; space - O(1)
    public static Node reverse2(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node last = null;
        Node current = head;

        while(current != null){
            last = current.back;
            current.back =current.next;
            current.next = last;

            current = current.back;
        }
        return last.back;
    }
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        Node head = ConvertArrayToDoubleLinkedList.convert(arr);
        Node result = reverse1(head);
        ConvertArrayToDoubleLinkedList.print(result);
    }
}
