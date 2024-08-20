package PathSum;

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

    public void traverse(TreeNode root, int targetSum, int currSum){

        if(root == null) return;

        currSum += root.val;

        if(root.left == null && root.right == null && currSum == targetSum) {
            res = true;
            return;
        }

        traverse(root.left, targetSum, currSum);
        traverse(root.right, targetSum, currSum);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        traverse(root, targetSum, 0);

        return res;

    }
}