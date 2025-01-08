package SingleLinkedList;

public class BasicOperations {

    //1.Convert Array to Linked List

    public static Node convertArrayToLL(int[] arr){
       Node head = new Node(arr[0]);
       Node mover = head;

       for(int i=1;i<arr.length;i++){
           Node temp = new Node(arr[i]);
           mover.next = temp;
           mover = temp;
       }
       return head;
    }

    //3.Length of LL
    static int lengthOfLL(Node head){
       int count = 0;
       Node temp = head;
       while(temp != null){
           temp = temp.next;
           count++;
       }
       return count;
    }

    //4.search in LL
    static int checkIfPresent(Node head, int value){
       Node temp = head;
       while(temp != null){
           if(temp.data == value) {
               return 1;
           }
           temp = temp.next;
       }
       return 0;
    }

    //5.Remove Head
    static Node removeHead(Node head){
        if(head == null)  return head;
        head = head.next;
        return head;
    }

    //6.Remove tail
    static Node removeTail(Node head){
       if(head == null || head.next == null) return null;
       Node temp = head;
       while(temp.next.next != null){
           temp = temp.next;
       }
       temp.next = null;
       return head;
    }

    //7.Insert head
    static Node insertHead(Node head,int value){
        return new Node(value,head);
    }

    //8.Insert tail
    static Node insertTail(Node head,int value){
        if(head == null){
            return new Node(value);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(value);
        return head;
    }
    static void print(Node head){
       while(head != null){
           System.out.print(head.data + " ");
           head = head.next;
       }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {5,4,3,2};
        Node output = new Node(arr[0]);
        System.out.println(output.data);

        Node head = convertArrayToLL(arr);
        System.out.println(head.data);

        //2.Traversal in Linked List
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println(lengthOfLL(head));

        System.out.println(checkIfPresent(head,3));

       head = removeHead(head);
     //  print(head);

       head = removeTail(head);
     //   print(head);

      //head = insertHead(head,200);
      // print(head);

       head = insertTail(head,100);
       print(head);
    }
}
