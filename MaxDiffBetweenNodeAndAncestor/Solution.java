package MaxDiffBetweenNodeAndAncestor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

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

    public void traverse(TreeNode root, int maxVal, int minVal){

        if(root == null) return;

        minVal = Math.min(minVal, root.val);
        maxVal = Math.max(maxVal, root.val);

        int potential = Math.max(Math.abs(minVal - root.val), Math.abs(maxVal - root.val));

        res = Math.max(res, potential);

        traverse(root.left, maxVal, minVal);
        traverse(root.right, maxVal, minVal);

    }

    public int maxAncestorDiff(TreeNode root) {

        traverse(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        return res;

    }
}