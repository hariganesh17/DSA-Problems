package SingleLinkedList;

public class MiddleOfLinkedList {
    //Brute force - 2 pass -  time:O(N+N/2); space - O(1)
    public static Node middle1(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int middle = count/2;

        temp = head;
        while(middle > 0){
            temp = temp.next;
            middle--;
        }
        return temp;
    }
    //Optimized - one pass - Tortoise & Haze Algo - time:O(N) ; space -O(1)
    public static Node middle2(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = middle2(head);
        System.out.println(result.data);
    }
}
