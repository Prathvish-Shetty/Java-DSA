package _15Tree;
import java.util.*;

public class Traversal {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node = node;
            this.level = level;
        }
    }

    private static void preorder(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Node root){
        if (root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
/*
    private static void postorder(Node root){
        if (root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
*/
    private static void postorder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root!=null)  st.push(root);
        while(!st.isEmpty()){
            Node top = st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }

    private static void printNthLevel(Node root,int n){
        if (root==null) return;
        if(n==0)    System.out.print(root.val+" ");
        printNthLevel(root.left,n-1);
        printNthLevel(root.right,n-1);
//        the ans will be same for preorder,inorder,postorder
//        level order traversal from right to left by interchanging left and right
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;

        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(a);
        System.out.println();
        System.out.println("Level order : ");   // bfs
        levelOrder(a);
        System.out.println();
        /*
        System.out.print("Print elements of nth level : ");
        printNthLevel(a,2);
        System.out.println();
//        level order using nth level
        for (int i = 0; i < 3; i++) {   //  3 is total number of levels
            printNthLevel(a,i);
//            System.out.println();
        }

         */
    }

    /*
    private static void levelOrder(Node root) { // left to right
//        Queue<Node> q = new ArrayDeque<>();
        Queue<Node> q = new LinkedList<>();
        if (root!=null) q.add(root);
        while (!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null)    q.add(front.left);
            if(front.right!=null)    q.add(front.right);
//            if we interchange the above 2 lines it will print from right to left
        }
    }
     */

    private static void levelOrder(Node root) {
        int prevLevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if (root!=null) q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if (prevLevel!=lvl){
                prevLevel++;
                System.out.println();
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null)    q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null)    q.add(new Pair(temp.right,lvl+1));
        }
    }
}

// postorder
// (2 4 5 8)(3 6 9 7)1
// (4 (5 8) 2)((6 9) 7 3)1
// 4 8 5 2 9 6 7 3 1

/*
 eulers tour tree,bfs-breadth first search

 in dfs(depth first search) - the deepest node is visited and then backtracks to its parent node if no sibling of that
 node exists
Breadth First Search (BFS) traversal explores all the neighboring nodes at the present depth prior to moving on to the
 nodes at the next depth level. In the context of a tree, BFS traversal works similarly.

Euler tour is defined as a way of traversing tree such that each vertex is added to the tour when we visit it \
 (either moving down from parent vertex or returning from child vertex).
 We start from root and reach back to root after visiting all vertices.
It requires exactly 2*N-1 vertices to store Euler tour.
*/

/*
    preorder    root left right
    inorder     left root right
    postorder   left right root
    we can exchange the right and left to start from right
    preorder    root right left
    inorder     right root left
    postorder   right left root
 */

/*
    eulers tree
    easily find pre in post
    diameter iss the largest path of a binary tree
    diameter consists of edges

    diameter = 2 + height(LST) + height(RST) this formula is wrong as this doesnt work when any of the subtree isnull
    so instead of focusing on edges we can focus on level for leetcode 543

    diameter = levels(LST) + levels(RST) + 1 - 1
 */

/*
    Types of Binary tree
    full binary tree - 0 or 2 child nodes
    perfect binary tree - every node has 2 child nodes except the leaf nodes(nodes of the last level)
    complete binary tree - it is a perfect binary tree but its last levels can be incomplete from right side only
    heaps are complete binary trees
    balanced binary tree - where difference between levels(LST) and levels(RST) <=1 , it applies for every single node in the tree
        |levels(LST)-levels(RST)| <= 1
    Skewed binary tree - like a linked list,each node has ony left nodes or only right nodes
    Degenerate binary tree - every node has either 0 or 1 child
 */

/*
    BFS/Breadth first search/level order search/level wise search
 */

// when we reverse the reverse preorder we get postorder
// stack and a temporary variable node is required for iterative inorder traversal
