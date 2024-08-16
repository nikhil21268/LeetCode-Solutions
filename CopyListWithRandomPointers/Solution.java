package CopyListWithRandomPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) return head;

        HashMap<Node, Node> mappingToCopyNodes = new HashMap<>();

        Node node = head;

        while (node != null){
            mappingToCopyNodes.put(node, new Node(node.val));
            node = node.next;
        }

        node = head;

        while (node != null){

            Node newNode = mappingToCopyNodes.get(node);
            newNode.next = mappingToCopyNodes.get(node.next);
            newNode.random = mappingToCopyNodes.get(node.random);
            node = node.next;

        }

        node = head;
        return mappingToCopyNodes.get(node);

    }
}