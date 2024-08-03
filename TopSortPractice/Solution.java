package TopSortPractice;

import java.util.*;

class Graph {
    private int numVertices;
    private ArrayList<ArrayList<Integer>> adj;

    // Constructor
    public Graph(int vertices) {
        numVertices = vertices;
        adj = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    // A recursive function used by topologicalSort
    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        // Mark the current node as visited.
        visited[v] = true;

        // Recur for all the vertices adjacent to this vertex
        for (int i : adj.get(v)) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        // Push current vertex to stack which stores result
        stack.push(v);
    }

    // The function to do Topological Sort. It uses recursive topologicalSortUtil()
    void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[numVertices];

        // Call the recursive helper function to store Topological Sort starting from all vertices one by one
        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        // Print contents of stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    // Main method
    public static void main(String args[]) {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological sort of the given graph:");
        g.topologicalSort();
    }
}

