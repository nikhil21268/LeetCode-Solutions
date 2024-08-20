package InvertBinaryTree;

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

    public TreeNode traverse(TreeNode root, TreeNode root2){

        if(root == null) return null;

        if(root2 == null) root2 = new TreeNode(root.val);

        else root2.val = root.val;

        root2.right = traverse(root.left, root2.right);
        root2.left = traverse(root.right, root2.left);

        return root2;

    }

    public TreeNode invertTree(TreeNode root) {

        if(root == null) return root;

        TreeNode root2 = new TreeNode();

        traverse(root, root2);

        return root2;

    }
}