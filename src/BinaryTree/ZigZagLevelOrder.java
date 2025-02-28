package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrder {
    public static List<List<Integer>> zigZag(Node root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        boolean leftToRight = true;

        while(!nodeQueue.isEmpty()){
            int size = nodeQueue.size();

            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                row.add(0); // Pre-fill list to avoid index errors
            }

            for(int i=0;i<size;i++){
              Node node = nodeQueue.poll();

              int index = leftToRight ? i : (size - 1 - i);

              row.set(index,node.data);

              if(node.left != null){
                  nodeQueue.add(node.left);
              }
              if(node.right != null){
                  nodeQueue.add(node.right);
              }
            }
            leftToRight = !leftToRight;

            result.add(row);
        }
        return result;
    }
    public static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ZigZagLevelOrder solution = new ZigZagLevelOrder();

        // Get the zigzag level order traversal
        List<List<Integer>> result = ZigZagLevelOrder.zigZag(root);

        // Print the result
        printResult(result);
    }
}
