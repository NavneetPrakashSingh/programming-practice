package Leetcode.InorderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Inorder {
    public List<Node> traversal(Node parentNode) {
        List<Node> finalList = new LinkedList<>();
        Stack<Node> stack = new Stack<>();

        if (parentNode == null) {
            System.out.println("No node present");
            return finalList;
        }

        Node currentElement = parentNode;
        while (!stack.empty() || currentElement != null) {
            if(currentElement!=null){
                stack.push(currentElement);
                currentElement = currentElement.left;
            }else{
                currentElement = stack.pop();
                finalList.add(currentElement);
                currentElement = currentElement.right;
            }
        }
        return finalList;
    }
}
