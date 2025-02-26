package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static void postOrder(Node root,List<Integer> arr){
        if(root == null) return;

        postOrder(root.left,arr);
        postOrder(root.right,arr);
        arr.add(root.data);
    }
    public static List<Integer> postOrderTraversal(Node root){
        List<Integer> arr = new ArrayList<>();

        postOrder(root,arr);

        return arr;
    }
}
