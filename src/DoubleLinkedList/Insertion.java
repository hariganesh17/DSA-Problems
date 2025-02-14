package DoubleLinkedList;

public class Insertion {
    public static Node insertBeforeHead(Node head, int value){
        Node newHead = new Node(value,head,null);
        head.back = newHead;
        return newHead;
    }
    public static Node insertBeforeTail(Node head, int value){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        Node prev = temp.back;

        Node newNode = new Node(value,temp,prev);

        prev.next = newNode;
        temp.back = newNode;

        return head;
    }
    public static Node insertBeforeKth(Node head,int value,int k){
        if(k==1){
            return insertBeforeHead(head,value);
        }
        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;

        Node newNode = new Node(value,temp,prev);

        prev.next = newNode;
        temp.back = newNode;

        return head;
    }
    public static void insertBeforeNode(Node node,int value){
        Node prev = node.back;
        Node newNode = new Node(value,node,prev);
        prev.next = newNode;
        node.back = newNode;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Node head = ConvertArrayToDoubleLinkedList.convert(arr);
        insertBeforeNode(head.next.next.next,10);
        ConvertArrayToDoubleLinkedList.print(head);
    }
}
