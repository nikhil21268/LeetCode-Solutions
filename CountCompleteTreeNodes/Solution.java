package CountCompleteTreeNodes;


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
    public int f(TreeNode root){
        if(root == null) return 0;
        int leftHeight = 0;
        int rightHeight = 0;
        TreeNode left = root;
        TreeNode right = root;
        while(left != null){
            left = left.left;
            leftHeight++;
        }
        while(right != null){
            right = right.right;
            rightHeight++;
        }
        if(leftHeight == rightHeight) return (int)Math.pow(2, leftHeight) - 1;
        else{
            return f(root.left) + f(root.right) + 1;
        }
    }
    public int countNodes(TreeNode root) {
        return f(root);
    }
}