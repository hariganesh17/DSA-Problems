package SingleLinkedList;

import java.util.HashSet;

public class StartingPointOfLoop {
    public static Node startPoint1(Node head){
        //Brute force - Hashing - time: O(N) ; space: O(N)
        HashSet<Node> set = new HashSet<>();
        Node temp = head;

        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }
            set.add(temp);
            temp = temp.next;
        }
        return temp;
    }
    public static Node startPoint2(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
