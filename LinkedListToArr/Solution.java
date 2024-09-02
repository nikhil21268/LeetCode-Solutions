package LinkedListToArr;

class Node {
    public int val;
    public Node prev;
    public Node next;
};

class Solution {
    public int[] toArray(Node head) {

        int len = 0;

        Node node = head;
        while (node != null) {
            len++;
            node = node.next;
        }

        int[] res = new int[len];

        node = head;

        len = 0;
        while(node != null){
            res[len] = node.val;
            len++;
            node = node.next;
        }

        return res;

    }
}