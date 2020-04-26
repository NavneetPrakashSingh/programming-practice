package ProgrammingCreek;

import java.util.*;
import java.util.Stack;

public class FlattenBinaryTree {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode currentNode = root;
        while (!stack.isEmpty() || currentNode!=null){
            if(currentNode.right!=null){
                stack.push(currentNode.right);
            }
            if(currentNode.left!=null){
                currentNode.right = currentNode.left;
                currentNode.left = null;
            }else if(!stack.isEmpty()){

            }
            currentNode = currentNode.left;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        FlattenBinaryTree obj = new FlattenBinaryTree();
        obj.flatten(root);
    }
}
