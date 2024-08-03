package MaxDepthNAryTree;


import java.util.HashSet;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {

    int maxDepth = -1;
    public int traverse(Node root, int d){

        if(root == null) return 0;

        for(Node child: root.children){

            traverse(child, d + 1);
        }

        maxDepth = Math.max(maxDepth, d);
        return d;

    }

    public int maxDepth(Node root) {


        traverse(root, 0);

        return maxDepth+1;
    }
}
