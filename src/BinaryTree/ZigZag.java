package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {
    public static List<List<Integer>> traversal(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> subList = new LinkedList<>();

            for(int i=0;i<size;i++){
                Node node = queue.poll();

                if(leftToRight){
                    subList.addLast(node.data);
                }else{
                    subList.addFirst(node.data);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            leftToRight = !leftToRight;
            ans.add(subList);
        }
        return ans;
    }
}
