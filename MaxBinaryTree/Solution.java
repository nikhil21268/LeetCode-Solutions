package MaxBinaryTree;

import com.sun.source.tree.Tree;

import java.util.Arrays;

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

    TreeNode root;

    public void traverse(TreeNode root, int[] nums, int indexToChoose){

        if(root == null) return;

        root.val = nums[indexToChoose];

        traverse(root.left, nums, indexToChoose - 1);
        traverse(root.right, nums, indexToChoose + 1);

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        Arrays.sort(nums);

        root = new TreeNode(-1);

        traverse(root, nums, nums.length-1);

        return root;

    }
}