package ProgrammingCreek;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int value;
    TreeNode(int val){
        this.left = null;
        this.right = null;
        this.value = val;
    }
}

public class nthOrderTraversal {
    public List<List<Integer>> traversal(TreeNode parentNode){
        List<List<Integer>> currentList = new LinkedList<>();
        if(parentNode == null){
            return currentList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(parentNode);
        int level = 0;
        while(!queue.isEmpty()){
            level = queue.size();
            List<Integer> tempList = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                TreeNode removedNode = queue.remove();
                if(removedNode.left != null){
                    queue.add(removedNode.left);
                }
                if(removedNode.right!=null){
                    queue.add(removedNode.right);
                }
                tempList.add(removedNode.value);
            }
           currentList.add(tempList);
        }
        return currentList;
    }
}

class MainClass{
    public static void main(String[] args){
        TreeNode parentNode = new TreeNode(1);
        parentNode.left = new TreeNode(2);
        parentNode.left.left = new TreeNode(4);
        parentNode.right = new TreeNode(3);

        nthOrderTraversal inorderObj = new nthOrderTraversal();
        System.out.println(inorderObj.traversal(parentNode));
    }
}
