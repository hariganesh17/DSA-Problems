package SingleLinkedList;

public class InsertValueBeforeElement {
    public static Node insert(Node head, int element, int value){
        if(head == null){
            return head;
        }
        if(head.data == element){
            return new Node(value,head);
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == element){
                    Node newNode = new Node(value,temp.next);
                    temp.next = newNode;
                    break;
            }
            temp =temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Node head = BasicOperations.convertArrayToLL(arr);
        head = insert(head,2,0);
        BasicOperations.print(head);
    }
}
