package Practice.CountCompleteTreeNodes;

import java.util.HashSet;

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

    int res = 0;

    public void traverse(TreeNode root){

        if(root == null) return;

        res++;

        traverse(root.left);
        traverse(root.right);

    }

    public int countNodes(TreeNode root) {

        traverse(root);

        return res;

    }
}