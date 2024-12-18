package _25Graph;

import java.util.*;

public class CycleDetectionUndirectedGraph {
    static class Solution{
        static class Pair{
            int node;
            int parent;
            Pair(int node,int parent){
                this.node = node;
                this.parent = parent;
            }
        }
        private boolean findCycle(List<List<Integer>> adj){
            int n = adj.size();
            boolean[] visited = new boolean[n];
            for(int i=0;i<n;i++){
                if(!visited[i]){
                    if(bfs(new Pair(i,i-1),visited,adj))    return true;
                }
            }
            return false;
        }

        private boolean bfs(Pair p, boolean[] visited, List<List<Integer>> adj) {
            Queue<Pair> q = new LinkedList<>();
            q.add(p);
            visited[p.node] = true;
            while (!q.isEmpty()){
                Pair front = q.remove();
                int node = front.node, parent = front.parent;
                for(int neighbour : adj.get(node)){
                    if(!visited[neighbour]){
                        visited[neighbour] = true;
                        q.add(new Pair(neighbour,node));
                    } else if(neighbour!=parent)    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test case: Graph with a cycle
        int n = 4;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);
        adjList.get(3).add(0);
        adjList.get(0).add(3);

        boolean cycleDetected = solution.findCycle(adjList);
        System.out.println("Cycle detected: " + cycleDetected); // Output: true

        // Example test case: Graph without a cycle
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        cycleDetected = solution.findCycle(adjList);
        System.out.println("Cycle detected: " + cycleDetected); // Output: false
    }
}
/*
    SC = O(V)
    TC = O(V+2E)
 */

/*
    Bipartite graph
    when we can color each node of the graph with either red or blue and adjacent nodes must have different colors
    any acyclic graph is always bipartite
    although graph has cycle it can be bipartite
    any cyclic graph with even cyclic length is bipartite

    lc-785
*/

