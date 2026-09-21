import java.util.*;

public class BFSVisualizer {
    public static void main(String[] args) {
        // Build the graph
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D"));
        graph.put("C", Arrays.asList("A", "D"));
        graph.put("D", Arrays.asList("B", "C", "E", "F"));
        graph.put("E", Arrays.asList("D", "F"));
        graph.put("F", Arrays.asList("D", "E"));

        System.out.println("=== BFS Traversal Visualization ===");
        bfs("A", graph);
    }

    static void bfs(String start, Map<String, List<String>> graph) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List<String> traversalOrder = new ArrayList<>();

        queue.add(start);
        visited.add(start);

        System.out.println("\nStep-by-Step BFS Flow:");
        while (!queue.isEmpty()) {
            String current = queue.poll();
            traversalOrder.add(current);
            System.out.println("Visit " + current + " → enqueue neighbors: " + graph.get(current));

            for (String neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("\nTraversal Order:");
        for (int i = 0; i < traversalOrder.size(); i++) {
            System.out.print(traversalOrder.get(i));
            if (i < traversalOrder.size() - 1) System.out.print(" → ");
        }

        System.out.println("\n\nExpected Output: A B C D E F → shows BFS expanding outward from A");
    }
}
