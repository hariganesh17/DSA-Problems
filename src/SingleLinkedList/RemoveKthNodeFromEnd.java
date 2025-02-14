package SingleLinkedList;

public class RemoveKthNodeFromEnd {
    //Brute force - Time: O(length of LL) + O(COUNT - N length of LL) = O(2* length of LL); space O(1)
    public static Node remove(Node head,int k){
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if(count == k){
            return head.next;
        }
        temp = head;
        int result = count - k;

        while(temp != null){
            result--;
            if(result == 0) break;
            temp = temp.next;
        }
        Node deleteNode = temp.next;
        temp.next = temp.next.next;

        return head;
    }

    //Optimized -  time: O(lenght of LL) ; space-O(1)
    public static Node remove2(Node head,int k){
        Node fast = head;
        Node slow = head;

        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        Node deleteNode = slow.next;
        slow.next = slow.next.next;

        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head =  BasicOperations.convertArrayToLL(arr);
        Node result = remove2(head,1);
        BasicOperations.print(result);
    }
}
