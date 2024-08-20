package MaxDepthBinaryTree;

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

    public void dfs(TreeNode root, int d){

        if(root == null) return;

        res = Math.max(res, d);

        dfs(root.left, d + 1);
        dfs(root.right, d + 1);

    }

    public int maxDepth(TreeNode root) {

        dfs(root, 1);

        return res;
    }
}