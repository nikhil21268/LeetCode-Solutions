package ClosestBSTValue;

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

    ArrayList<Integer> arr;

    public void find(TreeNode root){

        if(root == null) {
            return;
        }

        arr.add(root.val);
        find(root.left);
        find(root.right);

    }

    public int closestValue(TreeNode root, double target) {

        arr = new ArrayList<>();

        find(root);

        Collections.sort(arr);

        if(arr.size() == 1) return arr.get(0);

        int targetInt = (int)Math.round(target);

        if(targetInt - target == 0.5){
            targetInt--;
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == targetInt) return targetInt;
            else if(arr.get(i) > targetInt){
                if(i == 0) return arr.get(i);
                if(Math.abs(arr.get(i) - targetInt) > Math.abs(arr.get(i-1) - targetInt)){
                    return arr.get(i-1);
                }
                return arr.get(i);
            }
        }

        return arr.get(arr.size()-1);

    }
}