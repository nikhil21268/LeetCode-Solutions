package Practice.SameTree;


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

    HashSet<Integer> visited;

    boolean res = true;

    public void dfs(TreeNode root1, TreeNode root2){

        if(res == false) return;

        if(root1 == null && root2 != null) {
            res = false;
            return;
        }

        if(root1 != null && root2 == null) {
            res = false;
            return;
        }

        if(root1 == null && root2 == null) return;

        if(root1.val != root2.val) {
            res = false;
            return;
        }

        dfs(root1.left, root2.left);
        dfs(root1.right, root2.right);



    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        dfs(p, q);

        return res;
    }
}