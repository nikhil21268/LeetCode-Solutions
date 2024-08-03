package MinDiffBST;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Collections;

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

    ArrayList<Integer> list = new ArrayList<>();

    public void traverse(TreeNode root){

        if(root == null) return;

        traverse(root.left);

        list.add(root.val);

        traverse(root.right);
    }

    public int getMinimumDifference(TreeNode root) {


        traverse(root);

        Collections.sort(list);

        int l = 0;
        int r = 1;

        int diff = Integer.MAX_VALUE;

        while(r < list.size()){

            diff = Math.min(diff, list.get(r) - list.get(l));

            l += 1;
            r = l+1;
        }

        return diff;

    }
}