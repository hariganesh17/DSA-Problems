package SingleLinkedList;

import java.util.HashSet;

public class Intersection {
    //Brute force : time- O(2N) ; space-O(N)
    public static Node intersection1(Node head1, Node head2){
        HashSet<Node> set = new HashSet<>();
        Node temp = head1;

        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }

        temp = head2;
        while(temp != null){
            if(set.contains(temp)) return temp;
            temp = temp.next;
        }
        return null;
    }
    //Optimized

    public static Node intersection2(Node head1, Node head2){
        if(head1 == null || head2 == null) return null;
        
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != temp2){
            temp1 = (temp1 == null) ? head2 : temp1.next;
            temp2 = (temp2 == null) ? head1 : temp2.next;
        }
        return temp1;
    }
}
