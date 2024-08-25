package BinarySearchTreeToGreaterSumTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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

    List<Integer> bstElements;

    int index = 0;
    int[] newList;

    public void traverse(TreeNode root){

        if(root == null) return;

        bstElements.add(root.val);

        traverse(root.left);
        traverse(root.right);

    }

    HashMap<Integer, Integer> map;
    public void traverse2(TreeNode root){

        if(root == null) return;

        root.val += map.get(root.val);

        traverse2(root.left);
        traverse2(root.right);

    }

    public TreeNode bstToGst(TreeNode root) {

        bstElements = new ArrayList<>();

        traverse(root);

        Collections.sort(bstElements);

        map =  new HashMap<>();

        int sum = 0;
        for (int i = bstElements.size()-1; i >= 0 ; i--) {

            map.put(bstElements.get(i), sum);
            sum += bstElements.get(i);

        }

        traverse2(root);

        return root;

    }
}