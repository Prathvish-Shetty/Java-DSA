package _18HeapsAndPriorityQueue;
class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val = val;
    }
}
public class isBTreeMaxHeap {
    public static boolean isMaxHeap(Node root){
        int n = size(root);
        return hasHOP(root) && isCBT(root,0,n);
    }

    private static int size(Node root){
        if(root==null)  return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static boolean isCBT(Node root,int i,Integer n) { // wrapper class is an object which is pass by reference
//        calculate size, if index of anu child greater than size return false
        if(root==null)  return true;
        if(i>=n)    return false;
        return isCBT(root.left,2*i+1,n) && isCBT(root.right,2*i+2,n);
    }

    private static boolean hasHOP(Node root) {
        if (root==null) return true;
        if(root.left!=null){
            if(root.val<root.left.val)  return false;
        }
        if(root.right!=null){
            if(root.val<root.right.val)  return false;
        }
        return hasHOP(root.left) && hasHOP(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);   // a is the root
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(4);

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;

        System.out.println(isMaxHeap(a));
    }
}

//check if given binary tree is maxHeap or not
//in a maxHeap p>c for all nodes(HOP) + CBT
//how to check if any Btree is cbt or not