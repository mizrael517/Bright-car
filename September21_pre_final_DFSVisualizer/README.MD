    Step-by-Step Output Breakdown
Visited: A

DFS starts at node A.

Marks A as visited.

Immediately dives into its first neighbor (B).

Visited: B

From A, DFS goes to B.

Marks B as visited.

Dives into B’s first neighbor (D).

Visited: D

From B, DFS goes to D.

D has no neighbors, so recursion ends here.

DFS backtracks to B.

Visited: E

Back at B, DFS now explores its second neighbor (E).

E has no neighbors, so recursion ends here.

DFS backtracks to A.

Visited: C

Back at A, DFS now explores its second neighbor (C).

Marks C as visited.

Dives into C’s neighbor (F).

Visited: F

From C, DFS goes to F.

F has no neighbors, so recursion ends.

DFS backtracks to C, then to A.

All nodes are now visited.
Visited: A
Visited: B
Visited: D
Visited: E
Visited: C
Visited: F

Key Takeaways
DFS dives deep into one branch before backtracking.

The recursion stack handles the backtracking automatically.

The traversal order depends on the order of neighbors in the adjacency list.

So the output shows DFS exploring A → B → D → E → C → F, which matches the expected depth-first behavior.
Mizrael M.Destao Jr