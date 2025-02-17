package SingleLinkedList;

public class SortLinkedList {
    public static Node getMiddle(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node mergeTwoList(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if(list1 != null)   temp.next = list1;
        if(list2 != null)   temp.next = list2;

        return dummy.next;
    }
    public static Node sort(Node head){
        if(head == null || head.next == null) return head;

        Node middle = getMiddle(head);
        Node left = head;
        Node right = middle.next;
        middle.next = null;

        left = sort(left);
        right = sort(right);

        return mergeTwoList(left, right);
    }
    public static void main(String[] args){
        int[] arr = {3,1,5,4,2};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = sort(head);
        BasicOperations.print(result);
    }
}
