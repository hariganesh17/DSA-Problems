package SingleLinkedList;

public class RemoveLoop {
    public static Node remove(Node head){
        if(head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;

        //Detect loop
        boolean hasLoop = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                hasLoop = true;
                break;
            }
        }
        if(!hasLoop) return head;

        //starting of loop
        slow = head;

        //if loop starts at head
        if(slow == fast){
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return head;
        }

        //else
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        return head;
    }

}
