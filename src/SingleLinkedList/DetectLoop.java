package SingleLinkedList;
import java.util.HashSet;

public class DetectLoop {
    public static boolean detect(Node head) {
        //Brute force - Hashing - time: O(N) ; space: O(N)
        HashSet<Node> set = new HashSet<>();
        Node temp = head;

        while(temp != null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }

    //Optimized - time: O(N) ; space:O(1)
    public static boolean detect2(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
