package BinaryTreeMaxPathSum;

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

    int res = Integer.MIN_VALUE;

    public int dfs(TreeNode root){

        if(root == null) return 0;

        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);

        res = Math.max(res, root.val + left + right);

        return root.val + Math.max(left, right);

    }

    public int maxPathSum(TreeNode root) {

        dfs(root);

        return res;
    }
}
