package BinaryTree;

import java.util.Stack;

public class PathSum {
    //brute
    public static boolean hasPathSum1(Node root,int targetSum){
        if(root == null) return false;

        Stack<Node> path = new Stack<>();
        Stack<Integer> sum = new Stack<>();

        path.push(root);
        sum.push(root.data);

        while(!path.isEmpty()){
            Node temp = path.pop();
            int sumTemp = sum.pop();

            if(temp.left == null && temp.right == null && sumTemp == targetSum){
                return true;
            }
            if(temp.left != null){
                path.push(temp.left);
                sum.push(temp.left.data + sumTemp);
            }
            if(temp.right != null){
                path.push(temp.right);
                sum.push(temp.right.data + sumTemp);
            }
        }
        return false;
    }
    //recurssive
    public static boolean hasPathSum2(Node root,int targetSum){
        if(root == null) return false;

        if(root.left == null && root.right == null){
            return root.data == targetSum;
        }
        int newTarget = targetSum - root.data;

        return hasPathSum2(root.left,newTarget) || hasPathSum2(root.right,newTarget);

    }
}
