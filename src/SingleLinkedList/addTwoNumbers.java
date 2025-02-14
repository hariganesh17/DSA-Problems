package SingleLinkedList;

public class addTwoNumbers {
    public static Node add(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyNode = new Node(-1);
        Node current = dummyNode;
        int carry = 0;
        int sum = 0;

        while(temp1 != null || temp2 != null ){
            sum = carry;
            if(temp1 != null){
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum += temp2.data;
                temp2 = temp2.next;
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            current.next = newNode;
            current = current.next;
        }
        if(carry > 0){
            current.next = new Node(carry);
        }
        return dummyNode.next;
    }
    public static void main(String[] args){
        int[] arr1 = {3,5};
        int[] arr2 = {4,5,9,9};
       Node head1 = BasicOperations.convertArrayToLL(arr1);
       Node head2 = BasicOperations.convertArrayToLL(arr2);
       Node result = add(head1,head2);
       BasicOperations.print(result);

    }
}
