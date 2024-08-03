package TwoSumBSTInput;

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

    HashSet<Integer> visited = new HashSet<>();
    boolean res = false;
    int target;

    public void traverse(TreeNode root){

        if(root == null) return;

        traverse(root.left);

        int current = root.val;
        if(visited.contains(target-current)) res = true;
        visited.add(root.val);

        traverse(root.right);
    }

    public boolean findTarget(TreeNode root, int k) {

        target = k;
        traverse(root);

        return res;
    }
}
