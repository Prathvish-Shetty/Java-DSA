package _25Graph;

import java.util.PriorityQueue;

public class PrimsAlgorithm {

    public static class Triplet implements Comparable<Triplet>{
        int node;
        int parent;
        int cost;
        Triplet(int node,int parent,int cost){
            this.node = node;
            this.parent = parent;
            this.cost = cost;
        }

        @Override
        public int compareTo(Triplet t) {
            if(this.cost == t.cost) return this.node - t.node;
            return this.cost - t.cost;
        }
    }
    public int minCostConnectPoints(int[][] points){
        int n = points.length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,-1,0));
        int minCost = 0;
        boolean[] vis = new boolean[n];
        vis[0] = true;
        while (!pq.isEmpty()){
            Triplet top = pq.remove();
            int node = top.node, parent = top.parent, cost = top.cost;
            minCost = cost;
            if (vis[node])  continue;   
            vis[node] = true;
            for (int i = 0; i < n; i++) {
                if(i==node || i==parent) continue;
                if (vis[i]) continue;
                int x1 = points[node][0], y1 = points[node][1];
                int x2 = points[i][0], y2 = points[i][1];
                int dist = Math.abs(x1-x2) + Math.abs(y1-y2);
                pq.add(new Triplet(i,node,dist));
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
/*        min cost to connect all points - leetcode 1584
        triplet nodeIdx,parentIdx,weight
        all points are connected to each other so no need to create adjacency list
*/
    }
}
/*
    only on undirected, weighted graph with one component
    a graph with n nodes and n-1 edges is a spanning tree
    we can traverse all nodes with minimum edges
    for a given graph there can be multiple spanning tree
    we can visualise it as a tree

    adj list (node,weight)
    0 -> (4,1)
    1 -> (3,1), (4,2)
    2 -> (4,3)
    3 -> (1,1)
    4 -> (1,2), (2,3), (0,4)

    edge list (from,to,weight)
    [(0,4,1), (2,4,3), (1,4,2), (1,3,1)]

    use visited array
    use min heap
    sum = 0
    node,parent,weight
    initially 0,-1,0
    create minimum spanning tree(mst) list

    put triplet in min heap if not visited

    lc 1584
 */