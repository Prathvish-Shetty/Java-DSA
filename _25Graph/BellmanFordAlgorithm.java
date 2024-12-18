package _25Graph;

import java.util.Arrays;

public class BellmanFordAlgorithm {
    public static void main(String[] args) {

    }
    public int networkDelayTime(int[][] times, int n, int src) {
        int[] delay = new int[n+1];
        Arrays.fill(delay, Integer.MAX_VALUE);
        delay[src] = 0;
        for(int x = 1; x < n; x++){ // run n-1 times
            for (int[] time : times) {
                int u = time[0], v = time[1], wt = time[2];
                if (delay[u] != Integer.MAX_VALUE && delay[u] + wt < delay[v])
                    delay[v] = delay[u] + wt;
            }
        }
//        nth time relaxation for -ve edge detection
        for(int x = 1; x < n; x++){ // run n-1 times
            for (int[] time : times) {
                int u = time[0], v = time[1], wt = time[2];
                if (delay[u] != Integer.MAX_VALUE && delay[u] + wt < delay[v])
                    return -1;  // indication -ve cycle
            }
        }
        return n;
    }
}
/*
 find shortest distance from src node to all other nodes in distance array
 dijkstra can work on directed and undirected graphs, issues on cyclic
 bellman ford algo work on directed graph, can find negative cycles, takes more time, edges are important

 for dijkstra we make adjacency list, for bf we make edge list

 create distance array, populate src wit 0 and others with Integer.MAX_VALUE

 if dist[u] + wt < dist[v]  : edge relaxing

 iterate n-1 times

 if you are applying dijkstra's algorithm on undirected graph, make the graph directed

 dijkstra algo will fail for -ve cycles

 TC = O(V*E)

 n-1 times edges relaxed, now one more time outside loop. if value reduces -ve weights - infinite loop
*/