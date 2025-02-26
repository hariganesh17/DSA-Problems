package BinarySerachTree;

public class LowestCommonAncestor {
    public static Node lowest(Node root,Node p, Node q){
        if(root == null) return null;

        int current = root.data;
        if(current < p.data && current < q.data){
            return lowest(root.right,p,q);
        }
        if(current > p.data && current > q.data){
            return lowest(root.left,p,q);
        }
        return root;
    }
}
