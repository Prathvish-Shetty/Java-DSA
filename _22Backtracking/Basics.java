package _22Backtracking;

import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        
    }
}
/*
Backtracking Algorithm
1 Build the solution step by step using recursion
2 State space tree is used to find all the solutions
3 Explore thr solutions and check if constraints are satisfied
4 If constraints are satisfied keep looking for the solution else algorithm returns to the previous level

ex subset sum, subset permutation and combination, rat in a maze, n queens, sudoku solver

take, not take at different levels

permutation : arrangement, order matters
combination : selection, order don't matter
*/

/*
    rat in a maze
    you cannot enter that cell if
    visited[r][c] = true
    m[r][c] = 0
    r>=0, r<n
    c>-0, c<n
    f(down) p+'D'
    f(left) p+'L'
    f(right) p+'R'
    f(up) p+'U'

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
     public static void solveMaze(ArrayList<String> ans, int r, int c, int[][] m, int n, String path, boolean[][] visited) {
        if (r == n - 1 && c == n - 1 && m[r][c] == 1) {
            ans.add(path);
            return;
        }
        if(r>=0 && r<n && c>=0 && c<n){
            if(visited[r][c]==true || m[r][c]==0)   return;
            visited[r][c] = true;
            solveMaze(ans,r+1,c,m,n,path+'D',visited);  // down
            solveMaze(ans,r,c-1,m,n,path+"L",visited);  // left
            solveMaze(ans,r,c+1,m,n,path+"R",visited);  // right
            solveMaze(ans,r-1,c,m,n,path+"U",visited);  // up
            visited[r][c] = false;
        }

    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (m[0][0] == 0) return ans;  // if start is blocked
        boolean[][] visited = new boolean[n][n];
        solveMaze(ans, 0, 0, m, n, "", visited);
        return ans;
    }
}

TC = 3^n2^2
SC = O(L*X) length * number
*/

/*
sudoku solver
 */
