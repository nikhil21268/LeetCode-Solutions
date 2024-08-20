package Practice.MinAbsoluteDifferenceBST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

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

    ArrayList<Integer> res;

    public void traverse(TreeNode root){

        if(root == null) return;

        res.add(root.val);

        traverse(root.left);
        traverse(root.right);

    }

    public int getMinimumDifference(TreeNode root) {

        res = new ArrayList<>();

        traverse(root);

        Collections.sort(res);

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < res.size()-1; i++) {

            int a = res.get(i);
            int b = res.get(i+1);

            minSum = Math.min(minSum, b-a);

        }

        return minSum;
    }
}