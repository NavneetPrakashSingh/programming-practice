package Leetcode.Easy.MaximumDepthOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    public int maxDepth(Node root){
        if(root == null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        List<List<Node>> list = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Node> nodesAtNthLevel = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                Node currentElement = queue.poll();
                if(currentElement.left!=null){
                    queue.add(currentElement.left);
                }
                if(currentElement.right!=null){
                    queue.add(currentElement.right);
                }
                nodesAtNthLevel.add(currentElement);
            }
            list.add(nodesAtNthLevel);

        }

        return list.size();
    }
}
