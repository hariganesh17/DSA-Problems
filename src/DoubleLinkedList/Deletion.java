package DoubleLinkedList;

import static DoubleLinkedList.ConvertArrayToDoubleLinkedList.convert;
import static DoubleLinkedList.ConvertArrayToDoubleLinkedList.print;

public class Deletion {
    public static Node removeHead(Node head){
        if(head == null || head.next == null) {
            return null;
        }

        Node prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        return head;
    }

    public static Node removeTail(Node head){
        if(head == null || head.next == null) return null;

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node newTail = tail.back;
        if( newTail != null) {      //prevent NPE
            newTail.next = null;
        }
        tail.back = null;

        return head;
    }
    public static Node removeKth(Node head,int k){
        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;

        if(prev == null && front == null){
            return null;
        }
        else if(prev == null){
           return removeHead(head);
        }else if(front == null){
            return removeTail(head);
        }else {
            prev.next = temp.next;
            front.back = temp.back;

            temp.back = null;
            temp.next = null;

        }
        return head;
    }
    public static void  removeNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        if(front == null){
            prev.next = null;
            temp.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Node head =convert(arr);
        removeNode(head.next.next.next);
        print(head);
    }
}
