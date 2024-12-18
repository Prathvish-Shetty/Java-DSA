package _16BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val = val;
    }
}
public class Basics {
    private static Node prev = null;
    private static int pred = 0;
    private static int succ = 0;
    private static void inorder(Node root,List<Integer> al){
        if(root==null)  return;
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
    }
    private static void inorderps(Node root,int val){
        if (prev!=null && prev.val==val || root == null) return;
        inorderps(root.left, val);
        prev = root;
        if(prev.val!=val)    pred = prev.val;
        succ = root.val;
        inorderps(root.right, val);
    }
    public static void main(String[] args) {
        Node a = new Node(4);   // a is the root
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(6);

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.right = f;

//        find predecessor & successor
        List<Integer> al = new ArrayList<>();
        inorder(a,al);
        int i = 0;
        for(;al.get(i)!=4;i++);
        System.out.println("predecessor : "+al.get(i-1));
        System.out.println("node : "+al.get(i));
        System.out.println("successor : "+al.get(i+1));

        inorderps(a,4);
        System.out.println("predecessor : "+pred);
        System.out.println("node : "+4);
        System.out.println("successor : "+succ);
    }
}
/*
    Binary Search Tree(BST) is a type of binary tree where for all nodes
    root.val > max(LST) && root.val < min(RST)
    node.val > max(LST) && node.val < min(RST)
    This is not a bst : left.val < root.val < right.val
*/

/*
    Can a bst contain duplicate elements ?
    In general a bst contains duplicate elements
    but if it is given that bst can contain duplicate, then properly see the definition in the question
*/

/*
    Find the minimum and maximum elements in a given bst without traversing the entire tree
    leftmost leaf node in the minimum
    and rightmost leaf node is the maximum
*/

/*
    Advantages
    Efficient searching
    Efficient insertion and deletion
    Usage in implementation of other data structures like set, maps, priority queues
*/

/*
    Disadvantages
    Lack of support for range queries, instead segment trees are used
    NOt that efficient in case of Unbalanced trees
*/

/*
    Applications
    Phonebook
    Dictionary
    Stock market analysis
*/

/*
    You have 3 nodes with different values. How many unique binary trees can be formed ?
    skew tree
    Total 5 structures can be made, each structure having 6 different binary trees, ie 3! ways
    total unique trees - 5 * 6 = 30

    2 nodes will have total 4 trees
*/

/*
    You have 3 nodes with different values. How many unique binary trees can be formed ?
    skew tree
    for given structure only 1 bst can be formed
    Number of bst = number of unique structures
*/

/*
    if we search the entire tree, then TC = O(n)
    in bst we do not need to search entire bst

    logn levels in balanced binary tree
    binary search - both time and space(recursive)
    best case O(logn) or O(h) for balanced binary tree
    average abd worst case O(h) , where h is height/levels of tree, for worst case height = total number of nodes
*/

/*
    Inorder traversal in bst is sorted
    preorder traversal of bst gives a unique tree
*/

//properties of bst are very important

/*
for a BT & BST:
    inorder predecessor - number just smaller than the given number
    inorder successor - number just greater than the given number
*/

//predecessor & successor of a bst
//if predecessor or successor is in lower level then maximum of lst is the predecessor & minimum of rst is the successor
//pred = root.left;
//while(pred.right!=null)
//    pred = pred.right;
//the above code will not work if inorder predecessor is at above level
//succ = root.right;
//while(succ.left!=null)
//    succ = succ.left;

// delete node in bst O(nlogn) or O(h)

// delete leaf node from bst
/*
    if(root.val>key)    lst will change
        root.left = delete(root.left,key);
    if(root.val>key)    rst will change
        root.right = delete(root.right);
    if(root.val==key)   return null;
*/

// Q) count bst subtrees that lie in a given range

// find the smallest element in bst root.left while it is not null
// find the largest element in bst root.right while it is not null

// shortest distance between two nodes in a bst - root,p,q : the path should pass through p+q/2

