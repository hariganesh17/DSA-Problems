package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public static void preOrder(Node root, List<Integer> arr){
        if(root == null){
            return;
        }
        arr.add(root.data);
        preOrder(root.left,arr);
        preOrder(root.right,arr);
    }
    public static List<Integer> preOrderTraversal(Node root){
        List<Integer> arr = new ArrayList<>();
        preOrder(root,arr);

        return arr;
    }
}
