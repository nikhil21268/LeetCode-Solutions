package BFSPractice;

import java.util.*;

 class Graph {
    private int numVertices;
    private LinkedList<Integer>[] adjLists;

    // Constructor
    public Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // Placeholder for BFS algorithm
    void BFS(int startVertex) {
        // Implement BFS here
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> q = new LinkedList<>();
        visited[startVertex] = true;
        while(!q.isEmpty()){
            int vertex = q.poll();
            System.out.println(vertex);
            visited[vertex] = true;
            for(int neighbors: adjLists[vertex]){
                if(!visited[neighbors]){
                    q.add(neighbors);
                }
            }
        }
    }

    // Main method to add edges and run BFS
    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 0)");

        g.BFS(0);
    }
}
