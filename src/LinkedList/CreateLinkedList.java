package LinkedList;
class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class CreateLinkedList {

    //convert array to linked list
    private static Node convertArrayToLL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    // length of linked list
    private static int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    //search in LL
    private static int checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    //print head
    private static void print(Node head){
        while(head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    //remove head
    private static Node removeHead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }
    // remove Tail
    private static Node removeTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    //remove k
    private static Node removeK(Node head,int k){
        if(head == null ){
            return head;
        }
        if(k == 1){
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev =temp;
            temp = temp.next;
        }
        return head;
    }
    //remove value
    private static Node removeValue(Node head,int value){
        if(head == null){
            return head;
        }
        if(head.data == value){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == value){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //Insert a value at head
    private static Node insertHead(Node head, int value){
        if(head == null){
            return new Node(value);
        }
        return new Node(value,head);
    }
    //Insert at tail
    private static Node insertTail(Node head, int value){
        if(head == null){
            return new Node(value);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args){
//        int[] arr ={1,4,6,8};
//        Node x = new Node(arr[2]);
//        System.out.println(x.data);

        //conevert arr to LL
        int[] arr = {2,5,6,7};
        Node head = convertArrayToLL(arr);
  //      System.out.println(head.data);

        //Traversing LL
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        //length
//        System.out.println(length(head));

        //Search
 //       System.out.println(checkIfPresent(head,7));

        //remove head
//        head = removeHead(head);
//        print(head);

        //remove tail
//        head = removeTail(head);
//        print(head);

        //remove k
//        head = removeK(head,2);
//        print(head);

        //remove value
//        head = removeValue(head,9);
//        print(head);

        //Insert Value
//        head = insertHead(head,100);
//        print(head);

        //Insert tail
        head = insertTail(head,100);
        print(head);
    }
}
