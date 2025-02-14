package DoubleLinkedList;

import SingleLinkedList.BasicOperations;

public class deleteAllOccurencesOfkey {
    public static Node delete(Node head,int k){
        Node temp = head;

        while(temp != null){
            if(temp.data == k) {
                if (temp == head) {
                    head = head.next;
                }
                Node nextNode = temp.next;
                Node prevNode = temp.back;

                if (nextNode != null) {
                    nextNode.back = prevNode;
                }
                if (prevNode != null) {
                    prevNode.next = nextNode;
                }
                temp = nextNode;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }
    public static void main(String[] args){
        int[] arr = {10,4,10,10,6,10};
        Node head = ConvertArrayToDoubleLinkedList.convert(arr);
        Node result = delete(head,10);
        ConvertArrayToDoubleLinkedList.print(result);
    }
}
