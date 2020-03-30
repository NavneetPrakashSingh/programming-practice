package ProgrammingCreek;
class Node{
    int value;
    Node next;
    public Node(int val){
        this.value = val;
        next = null;
    }
}
public class Stack {
    Node top;

    public boolean push(Node node){
        if(node == null){
            return false;
        }
        node.next = top;
        top = node;
        return true;
    }
    public Node pop(){
        if(top == null){
            return top;
        }
        Node temp = new Node(top.value);
        top = top.next;
        return temp;
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("Inside main");
        Stack stack = new Stack();
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.pop();
        stack.pop();
    }
}
