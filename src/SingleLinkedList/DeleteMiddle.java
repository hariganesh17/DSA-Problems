package SingleLinkedList;

public class DeleteMiddle  {
    //Brute force - two pass
    public static Node delete1(Node head){
        if(head == null || head.next == null)   return null;
        Node temp = head;
        int N = 0;
        while(temp != null){
            N++;
            temp = temp.next;
        }
        temp = head;
        int middleIndex = N/2;

        for(int i=0;i<middleIndex-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    //Optimized - Tortoise and Hare - skip slow 1st time
    public static Node delete2(Node head){
        Node slow = head;
        Node fast = head;
        fast = fast.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = delete2(head);
        BasicOperations.print(result);
    }
}
