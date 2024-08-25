package DeepestLeavesSum;

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
    int maxHeight = 0;

    public int traverse1(TreeNode root, int h){

        if(root == null) return h;

        maxHeight = Math.max(maxHeight, h);

        traverse1(root.left, h + 1);
        traverse1(root.right, h + 1);

        return h;
    }

    public int traverse2(TreeNode root, int h){

        if(root == null) return h;

        if(h == maxHeight) res += root.val;

        traverse2(root.left, h + 1);
        traverse2(root.right, h + 1);

        return h;

    }

    public int deepestLeavesSum(TreeNode root) {

        traverse1(root, 0);

        traverse2(root, 0);

        return res;

    }
}