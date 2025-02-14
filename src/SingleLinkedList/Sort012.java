package SingleLinkedList;

public class Sort012 {
    public static Node sort1(Node head){
        //Brute force - Data replacement - time:O(2N) ; space:O(1)
        Node temp = head;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        while(temp != null){
            if(temp.data == 0){
                count0++;
            }else if(temp.data == 1){
                count1++;
            }else{
                count2++;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(count0 > 0){
                temp.data = 0;
                count0--;
            }else if(count1 > 0){
                temp.data = 1;
                count1--;
            }else{
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node sort2(Node head){
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node temp = head;
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        while(temp !=  null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        Node newNode = zeroHead.next;   // change the head
        return newNode;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,0,1,2,0};
        Node head = BasicOperations.convertArrayToLL(arr);
        Node result = sort2(head);
        BasicOperations.print(result);
    }
}
