package _21DynamicProgramming;

public class Basics {
    public static void main(String[] args) {

    }
}
/*
    Memoization & tabulation
    1D DP problems
    2D DP grid problems
    Knapsack & unbounded Knapsack Problems
    DP on strings
    MCM(matrix chain multiplication) problems and DP on trees


    DP is advanced/optimised recursion

    DP overcomes overlapping sub problems in recursion
    we are making useless calls instead we can store that result somewhere else

    recursion tree has n levels,
    it is a balanced binary tree with n levels, so number of nodes/calls are 2^n

    for calculating TC calculate total number of calls
    1+2+4+8+...+2^n-1 = 2^n    (exponential TC)
    SC = O(n)  recursive callstack space

    O(logn) < O(n) < O(n*logn) < O(n^2) < O(n^2logn) < O(n^3) << O(2^n)

    we will use Recursive DP = topdown DP =  recursion + memoization
    distinct amount of calls are n+1
    total calls = 2n-1 = O(n)
    SC = O(n)   array space

    dp, memo, lookup

    tabulation = bottom up dp = iterative dp
    space can be optimised in tabulation

    DP = using previous results to compute new results
    optimal substructure
*/

/*
    Path which passes through certain checkpoints
    a*b*c
    shortest path a+b+c 
*/

