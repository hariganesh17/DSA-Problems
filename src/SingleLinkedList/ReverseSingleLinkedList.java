package SingleLinkedList;

public class ReverseSingleLinkedList {
    public static Node reverse(Node head){
        if(head == null || head.next == null) {
            return head;
        }
        Node last = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = last;
            last = current;
            current = nextNode;
        }
        return last;
    }
    public static Node recursive(Node head){
        if(head == null || head.next == null)   return head;

        Node newHead = recursive(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = recursive(head);
        BasicOperations.print(result);
    }
}
