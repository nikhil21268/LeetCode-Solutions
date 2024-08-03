package BinaryTreeLevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return res;
        q.add(root);
        while(!q.isEmpty()){
            int qLen = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < qLen; i++){
                TreeNode node = q.poll();
                if(node != null){
                    level.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(!level.isEmpty()) res.add(level);
        } return res;
    }
}