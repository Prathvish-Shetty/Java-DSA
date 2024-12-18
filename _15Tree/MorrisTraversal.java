package _15Tree;

public class MorrisTraversal {
}
/*
    Traversals - preorder,inorder,postorder (recursive) : TC = O(n), SC = O(logn) for bc and O(n) for wc

    IMP : Morris traversal helps to do inorder traversal in O(1) space
    for morris traversal you need to know inorder predecessor

    delete 2 child node using inorder successor

    concept : linking & unlinking
    change tree structure

    while(curr!=null){
        if(curr.left!=null){
    `       Node pred = curr.left;
            while(pred.right!=null && pred.right!=curr) pred = pred.right;
            if(pred.right==null){ link
                pred.right = curr;
                curr = curr.left;
            }
            else{ unlink
                visit(curr);
                curr = curr.right;
                pred.right = null;
            }
        }
        else{
            visit(curr);
            curr = curr.right;
        }
    }


*/