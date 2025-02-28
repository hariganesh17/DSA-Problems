package BinaryTree;

public class Symmetric {
    public static boolean isSymmetricTree(Node root){
        return root == null || checkSymmetric(root.left,root.right);
    }
    private static boolean checkSymmetric(Node left, Node right){
        if(left == null || right == null) return left == right;

        if(left.data != right.data) return false;

        return checkSymmetric(left.left,right.right) &&
                checkSymmetric(left.right,right.left);
    }
}
