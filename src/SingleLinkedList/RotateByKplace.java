package SingleLinkedList;

public class RotateByKplace {
    public static Node getNewTail(Node head,int k){
        int count = 1;
        Node temp = head;

        while(temp != null){
            if(count == k) return temp;
            count++;
            temp = temp.next;
        }
        return temp;
    }
    public static Node rotate(Node head,int k){
        int length = 1;
        Node tail = head;

        while(tail.next != null){
            length++;
            tail = tail.next;
        }
        if(k % length == 0) return head;
        k = k % length;

        tail.next = head;

        Node newTail = getNewTail(head,length-k);
        head = newTail.next;
        newTail.next = null;

        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = rotate(head,2);
        BasicOperations.print(result);
    }
}
