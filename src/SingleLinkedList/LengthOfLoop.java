package SingleLinkedList;

import java.util.HashMap;

public class LengthOfLoop {
    //Brute force - Hashing
    public static int length(Node head){
        HashMap<Node,Integer> map = new HashMap<>();
        int count = 0;
        Node temp = head;

        while(temp != null){
            if(map.containsKey(temp)){
                int value = map.getOrDefault(temp,count);
                return count - value;
            }
            map.put(temp,count++);
            temp = temp.next;
        }
        return 0;
    }
    // optimized - Tortoise and Hare
    public static int lengthOfLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                Node temp = slow.next;
                int count = 1;

                while(temp != slow){
                    temp = temp.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
