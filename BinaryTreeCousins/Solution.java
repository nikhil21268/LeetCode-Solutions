package BinaryTreeCousins;

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

    boolean res = false;

    public void traverse(TreeNode root, int x, int y){

        if(root == null) return;

        traverse(root.left, x, y);
        traverse(root.right, x, y);

    }

    public boolean isCousins(TreeNode root, int x, int y) {

        traverse(root, x, y);

        return res;

    }
}