package _25Graph;

public class CycleDetectionDirectedGraph {
}
/*
    for bfs apply kahn's algo
    if topological array size != number of nodes in graph
    then graph is cyclic

    in dfs we don't need to pass parent for directed graph
    we need extra array path
    we also don't need in degree array

    is graph bipartite:
    acyclic graph is always bipartite

    207. Course Schedule
    in this directed graph if it is cyclic then can finish else cannot
    use kahn's algorithm
    create adjacency list
    there is no need of visited array

    210. Course Schedule 2

    lc-802
    the nodes which are part of any cycle are not safe states
    after reversing indegree to outdegree, terminal nodes will go to safe nodes
 */
