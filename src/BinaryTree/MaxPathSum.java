package BinaryTree;

public class MaxPathSum {
    //At each node, get max path sum down left & right (ignore negative paths by max with 0), update max including node 
    // + both sides, return max path down one side + node val
    public static int maxPathSum(Node root){
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;

        maxPathDown(root,maxValue);

        return maxValue[0];
    }
    private static int maxPathDown(Node node,int maxValue[]){
        if(node == null) return 0;

        int left = Math.max(maxPathDown(node.left,maxValue),0);
        int right = Math.max(maxPathDown(node.right,maxValue),0);

        maxValue[0] = Math.max(maxValue[0], left+right+node.data);

        return Math.max(left,right) + node.data;
    }
}
