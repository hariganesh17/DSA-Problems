package BinaryTree;

import java.util.List;

public class Root {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result1 = PreOrder.preOrderTraversal(root);
        List<Integer> result2 = InOrder.inOrderTraversal(root);
        List<Integer> result3 = PostOrder.postOrderTraversal(root);

        int result4 = MaximumDepth.height(root);
        System.out.println(result4);
    }
}
