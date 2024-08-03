package FindLeavesOfABinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
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

    HashSet<TreeNode> visited;

    HashSet<TreeNode> bossVisited = new HashSet<>();

    int flg = 0;

    public List<Integer> dfs(TreeNode root, List<Integer> list){

        if(bossVisited.contains(root)) return list;

        if(visited.contains(root)) return list;

//        if(bossVisited.contains(root.left))

        if(root.left == null && root.right == null) {
            list.add(root.val);
            System.out.println("Added" + " " + root.val);
            visited.add(root);
            bossVisited.add(root);
            return list;
        }

        if(!bossVisited.contains(root.left)) dfs(root.left, list);
        if(!bossVisited.contains(root.right)) dfs(root.right, list);

        visited.add(root);

        return list;

    }

    public List<List<Integer>> findLeaves(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        while(!bossVisited.contains(root)){

            visited = new HashSet<>();

            List<Integer> list = new ArrayList<>();
            res.add(dfs(root, list));
        }

        return res;
    }
}