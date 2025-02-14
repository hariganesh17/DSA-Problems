package SingleLinkedList;

import java.util.Stack;

public class Pallindrome {
    //Brute force - time: O(2N) ; space: O(N)
    public static boolean checkPallindrome1(Node head){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    //optimized - time:O(2N) ; space: O(1)
    public static boolean checkPallindrome2(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = ReverseSingleLinkedList.reverse(slow);
        Node first = head;
        Node second = newHead;
        while(second != null){
            if(first.data != second.data){
                ReverseSingleLinkedList.reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        ReverseSingleLinkedList.reverse(newHead);
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,3,2,1};
        Node head = BasicOperations.convertArrayToLL(arr);
        System.out.println(checkPallindrome2(head));
    }
}
