import java.util.*;

public class Main {
    static class Graph {
        private int vertices;
        private List<List<Integer>> adjacencyList;

        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyList = new ArrayList<>();

            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }

        // Method to add an edge to the graph
        public void addEdge(int u, int v) {
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u); // For undirected graph
        }

        // Method to perform DFS traversal
        public void dfsTraversal(int startVertex) {
            boolean[] visited = new boolean[vertices];
            System.out.println("DFS Traversal:");
            dfsHelper(startVertex, visited);
        }

        // Recursive helper method for DFS traversal
        private void dfsHelper(int vertex, boolean[] visited) {
            visited[vertex] = true;
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited[neighbor]) {
                    dfsHelper(neighbor, visited);
                }
            }
        }

        // Method to perform BFS traversal
        public void bfsTraversal(int startVertex) {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();

            System.out.println("BFS Traversal:");
            visited[startVertex] = true;
            queue.add(startVertex);

            while (!queue.isEmpty()) {
                int currentVertex = queue.poll();
                System.out.print(currentVertex + " ");

                for (int neighbor : adjacencyList.get(currentVertex)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        Graph graph = new Graph(vertices);

        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        System.out.print("Enter the start vertex: ");
        int startVertex = scanner.nextInt();
        scanner.close();

        graph.dfsTraversal(startVertex);
        System.out.println();
        graph.bfsTraversal(startVertex);
    }
}
