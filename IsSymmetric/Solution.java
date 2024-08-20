package IsSymmetric;

import com.sun.source.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    boolean res = true;

    public void traverse(TreeNode root1, TreeNode root2){

        if(root1 == null && root2 != null){
            res = false;
            return;
        }

        else if(root1 != null && root2 == null){
            res = false;
            return;
        }

        else if(root1 == null && root2 == null) return;

        if(root1.val != root2.val){
            res = false;
            return;
        }

        traverse(root1.left, root2.right);
        traverse(root1.right, root2.left);

    }

    public boolean isSymmetric(TreeNode root) {

        traverse(root.left, root.right);

        return res;

    }
}