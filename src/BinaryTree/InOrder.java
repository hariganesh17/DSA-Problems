package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    public static void inOrder(Node root,List<Integer> arr){
        if(root == null) return;

        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);
    }
    public static List<Integer> inOrderTraversal(Node root){
        List<Integer> arr = new ArrayList<>();
        inOrder(root,arr);

        return arr;
    }
}
