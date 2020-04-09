package ProgrammingCreek;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.Stack;

public class KthElement {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        int ans = 0;
        if(root == null){
            return ans;
        }
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> finalList = new LinkedList<>();
        TreeNode currentNode = root;

        while(!stack.isEmpty()|| currentNode!=null){

            if(currentNode!=null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }else{
                currentNode = stack.pop();
                finalList.add(currentNode.val);
                currentNode = currentNode.right;
            }

        }

        ans = finalList.get(k-1);
        return ans;
    }
    public static void main(String[] args){
        TreeNode parentNode = new   TreeNode(3);
        parentNode.left = new   TreeNode(1);
        parentNode.right = new   TreeNode(4);
        parentNode.left.right = new   TreeNode(2);

        KthElement kthElement = new KthElement();
        System.out.println(kthElement.kthSmallest(parentNode, 2));
        
    }
}
