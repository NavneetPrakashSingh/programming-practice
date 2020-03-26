package Leetcode.BFSTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<Node> traverse(Node parentNode){
        Queue<Node> queue = new LinkedList<>();
        List<Node> finalList = new LinkedList<>();

        Node currentNode = parentNode;
        queue.add(currentNode);
        while (!queue.isEmpty()){
            currentNode = queue.poll();
            finalList.add(currentNode);
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }

        return finalList;
    }
}
