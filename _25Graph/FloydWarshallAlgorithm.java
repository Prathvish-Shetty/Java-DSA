package _25Graph;

public class FloydWarshallAlgorithm {

}
/*
    Dijkstra : single source shortest path
    store shortest path from all nodes in 2d array
    go from a to b via c

    A,B = min(A,B, A,C + C,B)
    C will go from 0 to n


    for(int k = 0; k < n; j++){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++{
                dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
            }
        }
    }
    TC = O(n^3)
    SC = O(n^2)

    -ve cycles can be detected using floyd warshall algo

*/