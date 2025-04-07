package BinarySerachTree;

public class kthSmallest {
    int result = -1;
    int count = 0;
    public int smallest(Node root,int k){
        inOrder(root,k);
        return result;
    }
    //in order is always sorted in BST
    public  void inOrder(Node node,int k){
        if(node == null) return;

        inOrder(node.left,k);

        count++;
        if(count == k){
            result = node.data;
            return;
        }

        inOrder(node.right,k);
    }
}
