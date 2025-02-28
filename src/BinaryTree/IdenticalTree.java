package BinaryTree;

public class IdenticalTree {
    public static boolean isSameTree(Node p,Node q){
        if(p == null || q == null){
            return p == q;
        }
        return (p.data == q.data) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
