package ProgrammingCreek;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InvertBinaryTree {
    static class Node{
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    static class InvertTree{
        public Node invert(Node root){
            if(root==null){
                return null;
            }
            //traverse at each level and exchange the right node with the left node if it exists
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                Node currentElement = queue.poll();
                if(currentElement.left!=null){
                    queue.add(currentElement.left);
                }
                if(currentElement.right!=null){
                    queue.add(currentElement.right);
                }
                //exchange the nodes here since each node contains the entire trace within it. E.g node.left.left will still exists in the temp node
                Node tempNode = currentElement.left;
                currentElement.left = currentElement.right;
                currentElement.right = tempNode;
            }

            return root;
        }
    }
    public static void main(String[] args){
        Node parentNode = new Node(1);
        parentNode.left = new Node(2);
        parentNode.right = new Node(3);
        parentNode.left.left = new Node(4);
        parentNode.left.right = new Node(5);
        InvertTree invertTreeObj = new InvertTree();
        System.out.println(invertTreeObj.invert(parentNode));
    }
}
