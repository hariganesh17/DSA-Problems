package SingleLinkedList;


public class RemoveValueOnPosition {

    public static Node removeK(Node head, int k){
        if(head == null) return head;
        if(k == 1){
            head = head.next;
            return head;
        }

        //if k = other than 1
        int count = 0;
        Node temp = head;
        Node prev = null;

        while(temp != null){
            count++;

            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
           head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
       int[] arr = {2,4};
       Node head = convert(arr);
       head = removeK(head,1);
       print(head);
    }
}
