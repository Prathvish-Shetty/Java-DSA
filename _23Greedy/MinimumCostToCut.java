package _23Greedy;

import java.util.Arrays;
import java.util.Collections;

public class MinimumCostToCut {
    static int minimumCostOfBreaking(Integer[] X, Integer[] Y, int m, int n){
        int res = 0;
        Arrays.sort(X, Collections.reverseOrder());
        Arrays.sort(Y, Collections.reverseOrder());
        int h = 1, v = 1;   // horizontal and vertical
        int i = 0, j = 0;
        while(i<m && j<n){
            if(X[i]>Y[j]){
                res += X[i]*v;
                h++;
                i++;
            }
            else{
                res += Y[j]*h;
                v++;
                j++;
            }
        }
//        if horizontal array remains
        int total = 0;
        while(i<m)  total += X[i++];
        res += total*v;
//        if vertical array remains
        total = 0;
        while(j<n)  total += Y[j++];
        res += total*h;
        return res;
    }
    public static void main(String[] args) {
        int m = 6, n = 4;
        Integer X[] = {2, 1, 3, 1, 4};
        Integer Y[] = {4, 1, 2};
        System.out.print(minimumCostOfBreaking(X, Y, m-1, n-1));
    }
}

//Minimum Cost to cut a board into squares
/*
A board of length m and width n is given, we need to break this board into m*n squares such that cost of breaking is
minimum. cutting cost for each edge will be given for the board. In short, we need to choose such a sequence of
cutting such that cost is minimized.

Total_cost = Total_cost + edge_cost * total_pieces

spoj problem
chocola
*/