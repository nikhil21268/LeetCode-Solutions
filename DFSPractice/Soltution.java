package DFSPractice;

import java.util.*;

 class Graph {
    private int numVertices;  // Number of vertices
    private LinkedList<Integer>[] adjLists;  // Adjacency lists

    // Constructor
    public Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);  // Add forward edge
    }

    // DFS algorithm placeholder
    void DFS(int startVertex) {
        // Implement DFS here using recursion or a stack
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);
        visited[startVertex] = true;
        while(!stack.isEmpty()){
            int vertex = stack.pop();
            System.out.println(vertex);
            for(int neighbors: adjLists[vertex]){
                if(!visited[neighbors]){
                    stack.push(neighbors);
                    visited[neighbors] = true;
                }
            }
        }
    }

    // Main method to add edges and run DFS
    public static void main(String args[]) {
        Graph g = new Graph(4);  // Size of the graph

        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is the Depth First Traversal (starting from vertex 0)");

        g.DFS(0);  // Start DFS from vertex 0
    }
}
