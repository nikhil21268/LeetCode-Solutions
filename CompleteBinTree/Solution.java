package CompleteBinTree;

import java.util.HashSet;
import java.util.Queue;

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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        boolean foundNull = false;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                foundNull = true;
            } else{
                if(foundNull) return false;
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }
        return true;
    }
}