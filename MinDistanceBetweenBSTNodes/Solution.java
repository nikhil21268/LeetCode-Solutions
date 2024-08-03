package MinDistanceBetweenBSTNodes;

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

    public int minDiffInBST(TreeNode root) {

        int res = Integer.MAX_VALUE;

        traverse(root);

        Collections.sort(list);

        int l = 0;
        int r = 1;

        while(r < list.size()){

            int diff = list.get(r) - list.get(l);

            res = Math.min(diff, res);

            l++;
            r = l+1;
        }

        return res;
    }
}
