package ProgrammingCreek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            left = null;
            right = null;
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> treeList = new ArrayList<>();
        if(root == null){
            return treeList.size();
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> nodesAtNLevel = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentElement = queue.poll();
                if(currentElement.right!=null){
                    queue.add(currentElement.right);
                }
                if(currentElement.left!=null){
                    queue.add(currentElement.left);
                }
                nodesAtNLevel.add(currentElement.val);
            }
            treeList.add(nodesAtNLevel);
        }
        return treeList.size();
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(5);

        MaximumDepthOfBinaryTree mdobtObj = new MaximumDepthOfBinaryTree();
        System.out.println(mdobtObj.maxDepth(node));
    }
}
