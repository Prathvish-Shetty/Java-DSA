package _25Graph;

public class DisjointSetUnion {

}

/*

    detect cycle, no. of connected components, minimum spanning tree in undirected graph


    adjacency list size is 2E

    graph is either given in Adjacency matrix, Adjacency list, edge list

    dsu works good for edge list

    functions :  make, find, union

    root of the tree is the leader of the component

    create a parent array
    number of nodes having parent as themselves(leaders of group/province/component) = number of connected components

    we will visualise sets as tree

    find(a) - find leader of a
    union(a,b) - make them single component

    lc-number of provinces
    lc-684
*/

/*

   A tree is a graph where there are n nodes, n-1 edges and no cycles and self loops

 */