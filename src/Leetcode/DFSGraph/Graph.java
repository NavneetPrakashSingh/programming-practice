package Leetcode.DFSGraph;

import java.util.*;

public class Graph {
    int sizeOfGraph;
    boolean visited[];
    HashMap<Integer, List<Integer>> adjMatrix;

    public Graph(int sizeOfGraph) {
        this.sizeOfGraph = sizeOfGraph;
        this.visited = new boolean[sizeOfGraph];
        adjMatrix = new HashMap<>();
        for (int i = 0; i < sizeOfGraph; i++) {
            visited[i] = false;
            adjMatrix.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int from, int to) {
        List<Integer> listToAppend = adjMatrix.get(from);
        listToAppend.add(to);
        adjMatrix.put(from, listToAppend);

        List<Integer> listToAppendForOtherNode = adjMatrix.get(to);
        listToAppendForOtherNode.add(from);
        adjMatrix.put(to, listToAppendForOtherNode);
    }

    public List<Integer> dfs() {
        int ans = 0;
        List<Integer> finalList = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < sizeOfGraph; i++) {
            if (!visited[i]) {
                ans++;
                stack.push(i);
                while (!stack.isEmpty()) {
                    Integer poppedElement = stack.pop();
                    finalList.add(poppedElement);
                    visited[poppedElement] = true;

                    List<Integer> adjList = adjMatrix.get(poppedElement);
                    for (int j = 0; j < adjList.size(); j++) {
                        if(!visited[adjList.get(j)]){
                            stack.push(adjList.get(j));
                        }
                    }
                }
            }
        }
        System.out.println("Ans is: "+ans);
        return finalList;
    }
}
