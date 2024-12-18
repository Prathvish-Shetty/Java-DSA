package _25Graph;

public class Basic {
}
/*
    Nodes or vertices, edges/path, weight/dist/time/cost
    directed and undirected graph
    cycle and connected components
    directed acyclic graph
    All trees are graphs, but all graphs are not trees
    2 ways to represent graph
    adjacency matrix - 0s,1s , contains values in case of weighted graph
      2d matrix
    adjacency list - to save space
      list<list<Integer>> list
      0 : {1,2,3}
      1 : {0,3}
      2 : {0}
      3 : {0,1,4}
      4 : {3}
      adj = {{1,2,3},{0,3},{0},{0,1,4},{3}}

      tree is a directed graph without cycles
      while doing bfs, you can visualise the graph as tree
      use queue, visited boolean array having size of total number of nodes + 1, or hashmap

      dfs, bfs
      lc - 547, 841, 1971, 200
*/