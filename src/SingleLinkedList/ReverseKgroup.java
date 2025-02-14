package SingleLinkedList;

public class ReverseKgroup {
    public static Node getKthNode(Node temp,int k){
        k -= 1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public static Node reverse(Node temp){
        Node current = temp;
        Node last = null;
        Node nextNode;

        while(current != null){
            nextNode = current.next;
            current.next = last;
            last = current;
            current = nextNode;
        }
        return last;
    }
    public static Node reversek(Node head,int k){
        if(head == null || k <= 1) return head;

        Node temp = head;
        Node nextNode;
        Node prevNode = head;
        while(temp != null){
            Node kthNode = getKthNode(temp,k);
            if(kthNode == null){
                if(prevNode != null){
                    prevNode.next = temp;
                }
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if(temp == head){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = reversek(head,2);
        BasicOperations.print(result);
    }
}
