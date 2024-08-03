package AvgLevelsOfBinaryTree;


import java.util.*;

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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            int levelSize = q.size();

            long sum = 0;

            for(int i = 0; i < levelSize; i++){

                TreeNode node = q.poll();

                sum += node.val;

                if(node.left != null) q.offer(node.left);

                if(node.right != null) q.offer(node.right);

            }

            Double avg = (sum * 1.0) / levelSize;
            res.add(avg);

        }


        return res;

    }
}