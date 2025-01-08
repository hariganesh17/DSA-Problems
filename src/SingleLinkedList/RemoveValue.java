package SingleLinkedList;

public class RemoveValue {

    public static Node remove(Node head, int element){
        if(head == null) return head;
        if(head.data == element){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while(temp != null){

            if(temp.data == element){
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
        int[] arr = {2,4,5};
        Node head = convert(arr);
        head = remove(head,7);
        print(head);
    }
}
