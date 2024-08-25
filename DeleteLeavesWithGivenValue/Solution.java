package DeleteLeavesWithGivenValue;

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

    int flg = 0;
    public TreeNode traverse(TreeNode root, int target){

        if(root == null) return null;

        if(root.left == null && root.right == null && root.val == target){
            flg = 1;
            return null;
        }

        root.left = traverse(root.left, target);
        root.right = traverse(root.right, target);

        return root;

    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {

        while (true){
            root = traverse(root, target);
            if(flg == 0) break;
            flg = 0;
        }

        return root;

    }
}