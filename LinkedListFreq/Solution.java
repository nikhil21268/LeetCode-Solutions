package LinkedListFreq;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode frequenciesOfElements(ListNode head) {

        ListNode node = head;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(node != null){
            if(map.containsKey(node.val)) map.put(node.val, map.get(node.val) + 1);
            else map.put(node.val, 1);
            node = node.next;
        }

        ListNode head2 = new ListNode(-1);
        ListNode headCopy = head2;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ListNode newNode = new ListNode(entry.getValue());
            headCopy.next = newNode;
            headCopy = headCopy.next;
        }

        return head2.next;

    }
}