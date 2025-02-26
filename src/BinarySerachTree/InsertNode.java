package BinarySerachTree;

public class InsertNode {
    public static Node insert(Node root,int value){
        if(root == null) {
            return new Node(value);
        }
        Node current = root;
        while(current != null){
            if(current.data <= value){
                if(current.right != null){
                    current = current.right;
                }else{
                    current.right = new Node(value);
                    break;
                }
            }else{
                if(current.left != null){
                    current = current.left;
                }else{
                    current.left = new Node(value);
                    break;
                }
            }
        }
        return root;
    }
}
