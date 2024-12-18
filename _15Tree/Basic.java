package _15Tree;
class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val = val;
    }
}
public class Basic {
    private static void display(Node root) {
        if (root==null) return; // base case
        System.out.print(root.val+" ");
        display(root.left); // left subtree
        display(root.right);    // right subtree
    }

    public static int sum(Node root){
        if (root==null) return 0;
        return root.val + sum(root.left) +sum(root.right);
    }

    public static int prod(Node root){
        if (root==null) return 1;
        return root.val * sum(root.left) * sum(root.right);
//        int r = (root.val==0)?  1 : root.val;
//        return r * root.val * sum(root.left) * sum(root.right);
    }

    public static int max(Node root){
        if (root==null) return Integer.MIN_VALUE;
        int a = root.val,b = max(root.left),c = max(root.right);
        return Math.max(a,Math.max(b,c));
//        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

    public static int min(Node root){
//        if (root==null) return Integer.MAX_VALUE;
//        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
        return (root==null)? Integer.MAX_VALUE : Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }

    public static int size(Node root){
        if(root==null)  return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int level(Node root){
        if(root==null)  return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }

    public static int height(Node root){
        return level(root)-1;
    }

    public static void main(String[] args) {
        Node a = new Node(1);   // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.right = f;
        a.val = 1;
//        System.out.println(a.left.right.val);

//        root,left subtree ,right subtree
        display(a);
        System.out.println();

        Node g = new Node(7);
        Node h = new Node(8);
        c.left = g;e.right = h;

        System.out.println("Sum of elements of tree "+sum(a));
        System.out.println("Product of elements of tree "+prod(a));
        System.out.println("Maximum element of tree "+max(a));
        System.out.println("Minimum element of tree "+min(a));
        System.out.println("Size of tree "+size(a));
        System.out.println("Total Levels of tree "+level(a));
        System.out.println("Height of tree "+height(a));
    }
}

/*
    Tree is a hierarchical data structure
    it has one root which has no parent,and leaf nodes
    one node can be connected to any number of nodes
    parent node
    child node
    sibling - nodes with common parent
    Leaf nodes have no children
    Internal nodes are surrounded by nodes
    Ancestor and Descendant Node
    Size of tree is total number of nodes
    Number of edges = size-1
    root has no edge coming from parent
    Level = generation
    Height = level-1

    LL can have loops but trees cant have loops
    Traversing in a tree is done by depth first search(DFS) and Breadth first search(BFS)
    Trees has no loops and circuits
    It have no self loop

    Types of trees :
    1.Generic Tree - any node can hae any number of children/child nodes
    2.Binary Tree - any node can have 0,1,2 children.as there are atmost 2 child nodes we name them left and right node
    3.Binary search tree - left node is smaller and right node is larges than parent node in terms of value
    4.AVL tree - BSTs which are self balanced

    Applications of tree data structure
    Hierarchical data structure
    searching efficiency
    sorting ,visualization of heaps,maps,segment trees and other structures
    Dynamic data
    efficient insertion and deletion
    easy to implemant


*/

// every node in the tree is either the tree or a subtree
// one child can not have two parents in a tree