package ModeInABST;

import java.util.ArrayList;
import java.util.HashMap;
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

    HashMap<Integer, Integer> map = new HashMap<>();

    public void traverse(TreeNode root){

        if(root == null) return;

        traverse(root.left);

        if(map.containsKey(root.val)) map.put(root.val, map.get(root.val) + 1);
        else map.put(root.val, 1);

        traverse(root.right);

    }

    public int[] findMode(TreeNode root) {



        traverse(root);

        int maxFreq = -1;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){

            maxFreq = Math.max(maxFreq, entry.getValue());
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){

            if(entry.getValue() == maxFreq){

                list.add(entry.getKey());
            }
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {

            res[i] = list.get(i);
        }

        return res;
    }
}
