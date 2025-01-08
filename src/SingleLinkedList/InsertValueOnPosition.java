package SingleLinkedList;

public class InsertValueOnPosition {
    public static Node insertK(Node head,int element,int k){
        if(head == null){
            if(k==1){
                return new Node(element);
            }else{
                return head;
            }
        }
        if(k == 1){
            return new Node(element,head);
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k-1){
                Node newNode = new Node(element,temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4};
        Node head = BasicOperations.convertArrayToLL(arr);
        head = insertK(head,0,1);
        BasicOperations.print(head);
    }
}
