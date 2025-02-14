package SingleLinkedList;

import java.util.ArrayList;

public class OddEvenLinkedList {
    //Brute Force - Data replacement - time: 0(2N) ; space: O(N)
    public static Node sort1(Node head){
        ArrayList<Integer> list = new ArrayList<>();

        // odd index
        Node temp = head;
        while(temp != null && temp.next != null){
            list.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null){
            list.add(temp.data);
        }

        //even index
         temp = head.next;
        while(temp != null && temp.next != null){
            list.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null){
            list.add(temp.data);
        }

        //re- assign list values to LL
        temp = head;
        int i=0;
            while(temp != null){
                temp.data = list.get(i++);
                temp = temp.next;
            }
        return head;
    }
    //optimized - Link change
    public static Node sort2(Node head ){
        if(head == null || head.next == null) return head;

        Node odd =head;
        Node even = head.next;
        Node evenNode = head.next;

        while(even !=null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenNode;
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,3,4,2,5,6};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = sort2(head);
        BasicOperations.print(result);
    }
}
