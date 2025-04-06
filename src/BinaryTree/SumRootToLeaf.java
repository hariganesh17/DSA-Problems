package BinaryTree;

public class SumRootToLeaf {
    public static int sumNumbers(Node root){
       return sum(root,0);
    }
    private static int  sum(Node node,int currentNum){
        if(node == null) return 0;

        currentNum = currentNum*10 + node.data;

        if(node.left == null && node.right == null){
            return currentNum;
        }

        int left = sum(node.left,currentNum);
        int right = sum(node.right,currentNum);

        return left + right;
    }
}
