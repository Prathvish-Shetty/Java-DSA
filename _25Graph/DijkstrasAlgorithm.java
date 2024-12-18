package _25Graph;

public class DijkstrasAlgorithm {
}
/*
    go from one node to all nodes in minimum/maximum cost
    bfs + priority queue/heaps
    using queue takes more time than heap
    for adjacency list create list of pair

    Maximum edges in an undirected graph: n(n−1)/2
    Maximum edges in a directed graph: n(n−1)

    pq.add(new Pair(0,0))
    while(pq.size()>0){
        pair top = pq.remove()
        for(Pair p : adj.get(node)){
            totalDist = top.dist + p.dist
            if(dist[p.node]>totalDist){
                dist[p.node] = totalDist
                pq.add(new Pair(p.node,total))
            }
        }
    }
*/

/*
    lc-743, 1514, 1631, 787
 */