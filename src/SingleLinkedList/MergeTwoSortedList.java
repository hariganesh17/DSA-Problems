package SingleLinkedList;

public class MergeTwoSortedList {
    /*Brute force : time: O(N1+N2) + O(N log N) + O(N) ; space: O(N)
    Traverse both one by one and place it in new array list
    Sort the array
    Convert array to LL*/

    //Optimized - two pointers - link change

    public static Node merge(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(temp1 != null && temp2 != null){
            if(temp1.data <= temp2.data){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 != null){
            temp.next = temp1;
        }else{
            temp.next = temp2;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,5,6,7};

        Node head1 = BasicOperations.convertArrayToLL(arr1);
        Node head2 = BasicOperations.convertArrayToLL(arr2);

        Node result = merge(head1, head2);
        BasicOperations.print(result);
    }
}
