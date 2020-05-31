package Leetcode.Medium.SumRootToLeafNumbersTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SumRootToLeafNumbers {


    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode currentElement = queue.poll();
            if (currentElement.left != null) {
                currentElement.left.val = currentElement.val * 10 + currentElement.left.val;
                queue.add(currentElement.left);

            }

            if (currentElement.right != null) {
                currentElement.right.val = currentElement.val * 10 + currentElement.right.val;
                queue.add(currentElement.right);

            }

            if (currentElement.right == null && currentElement.left == null) {
                sum += currentElement.val;
            }

        }

        return sum;
    }

//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(0);
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(1);
//        System.out.println(SumRootToLeafNumbers.sumNumbers(root));
//
//    }

}
