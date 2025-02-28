package BinaryTree;

public class Diameter {
    public static int diameterOfBinaryTree(Node root){
        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }
    public static int height(Node root,int[] diameter){
        if(root == null) return 0;

        int leftHeight = height(root.left,diameter);
        int rightHeight = height(root.right,diameter);

        diameter[0] = Math.max(diameter[0],leftHeight+rightHeight);

        return 1 + Math.max(leftHeight,rightHeight);
    }
}
