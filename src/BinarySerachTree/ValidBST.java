package BinarySerachTree;

public class ValidBST {
    public static boolean validBST(Node root){
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    //fix the range , ie: if at node then it should be b/w min and max value
    public static boolean isValidBST(Node root,long minValue, long maxValue){
        if(root == null) return true;
        if(root.data >= maxValue || root.data <= minValue) return false;

        return isValidBST(root.left,minValue,root.data) && isValidBST(root.right,root.data,maxValue);
    }
}
