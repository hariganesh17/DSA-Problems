package BinaryTree;

public class LowestCommonAncestor {
    public static Node lowest(Node root,Node p, Node q){
        if(root == null || root == p || root == q) return root;

        Node left = lowest(root.left,p,q);
        Node right = lowest(root.right,p,q);

        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
}
