package _25Graph;

public class TopologicalSort {
    public static void main(String[] args) {

    }
}
/*
    Topological sort is done on DAG Directed acyclic graph
    ordering of all nodes of the graph such that if a and b are nodes and a->b in the ordering a will always come before b
    if there is an edge between a and b then a should appear before b
    topological sort cannot be applied to cyclic graphs
    starting node has no incoming edges

    topological sort using dfs
    for i->n-1{
        if(!visited[i])  dfs(i)
    }
    void dfs(i){
        visited[i] = true
        for ele->adj{
          if(!visited[i])  dfs(ele)
        }
        ans.add(i)
    }
    ans.reverse()
*/
/*
    BFS Kahn's algorithm
    0 incoming should be first, max incoming should be last
    in degree, out degree in case of directed graph only
    in degree array
*/

/*
    In a directed acyclic graph(DAG) when we apply topological sort/bfs/kahn's algorithm, we visit all the nodes
    so if we have a directed cyclic graph and we apply kahn's algorithm then something unusual happens
    if size of ans is less than total number of nodes then graph is cyclic
    if all nodes of a graph have in degree greater then 0 then it is a cyclic graph
*/

/* Alien dictionary
    graph will be of 26 size
    topological sort
    list of list having size 26
 */