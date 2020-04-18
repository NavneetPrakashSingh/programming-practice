package ProgrammingCreek;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> values = new LinkedList<>();
        nodes.add(root);
        values.add(root.val);
        while (!nodes.isEmpty()) {
            TreeNode currentNode = nodes.poll();
            Integer currentValue = values.poll();
            if (currentNode.left == null && currentNode.right == null && currentValue == sum) {
                return true;
            }
            if (currentNode.left != null) {
                nodes.add(currentNode.left);
                values.add(currentValue + currentNode.left.val);
            }
            if (currentNode.right != null) {
                nodes.add(currentNode.right);
                values.add(currentValue + currentNode.right.val);
            }
        }
        return false;
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.left = this.right = null;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        PathSum sumObj = new PathSum();

        System.out.println(sumObj.hasPathSum(root, 22));
    }

}
