import java.util.*;

public class DFSVisualizer {

    // Recursive DFS function
    static void dfs(String node, Map<String, List<String>> graph, Set<String> visited) {
        // Step 1: Mark current node as visited
        visited.add(node);
        System.out.println("Visited: " + node);

        // Step 2: Get neighbors
        List<String> neighbors = graph.getOrDefault(node, new ArrayList<>());

        // Step 3: Dive into each unvisited neighbor
        for (String neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited); // recursion
            }
        }
    }

    public static void main(String[] args) {
        // Build the graph
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", new ArrayList<>());
        graph.put("E", new ArrayList<>());
        graph.put("F", new ArrayList<>());

        System.out.println("=== DFS Traversal Visualization ===\n");
        dfs("A", graph, new HashSet<>());

        System.out.println("\nExpected Output:");
        System.out.println("Visited: A");
        System.out.println("Visited: B");
        System.out.println("Visited: D");
        System.out.println("Visited: E");
        System.out.println("Visited: C");
        System.out.println("Visited: F");
        System.out.println("\n➡️ DFS dives deep into each branch before backtracking.");
    }
}
