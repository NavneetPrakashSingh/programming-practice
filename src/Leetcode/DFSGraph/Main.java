package Leetcode.DFSGraph;

public class Main {
    public static void main(String[] args){
        Graph graph = new Graph(5);
        graph.addEdge(1,0);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        System.out.println(graph.dfs());
    }
}
