import java.util.*;

public class BFS {

    static List<String> bfs(String startNode, Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        List<String> traversalOrder = new ArrayList<>();

        // Step 1: Push start node to queue & mark visited
        queue.add(startNode);
        visited.add(startNode);

        // Step 2: Keep going as long as people are in line
        while (!queue.isEmpty()) {
            // Step 3: Get the person at the front of the line
            String currentNode = queue.poll();
            traversalOrder.add(currentNode);

            // Step 4: Look at all their friends
            List<String> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());
            for (String neighbor : neighbors) {
                // Step 5: If they haven't heard the rumor, put them in line!
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return traversalOrder;
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

        // Run BFS starting at A
        List<String> result = bfs("A", graph);

        // Print traversal order
        System.out.println("=== BFS Traversal ===");
        for (String node : result) {
            System.out.println("Visited: " + node);
        }

        // Expected output summary
        System.out.println("\nExpected Output:");
        System.out.println("Traversal Order: A B C D E F");
        System.out.println("➡️ BFS expands outward from A, level by level.");
    }
}
