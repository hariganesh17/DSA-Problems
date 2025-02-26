package BinarySerachTree;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }
    Node(int data1,Node left1,Node right1){
        this.data = data1;
        this.left = left1;
        this.right = right1;
    }
}
