package SecondMinNodeBinaryTree;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;

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

    PriorityQueue<Integer> q = new PriorityQueue<>();

    HashSet<Integer> set = new HashSet<>();

    public void traverse(TreeNode root){

        if(root == null) return;

        traverse(root.left);

        if(!set.contains(root.val)){
            q.offer(root.val);
            set.add(root.val);
        }

        traverse(root.right);

    }

    public int findSecondMinimumValue(TreeNode root) {
        int res = -1;

        traverse(root);

        if(!q.isEmpty()) q.poll();

        if(!q.isEmpty()) res = q.poll();


        return res;

    }
}
