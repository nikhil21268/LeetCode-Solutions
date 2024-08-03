package LinkedListCycle;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        HashSet<ListNode> set = new HashSet<>();
        while(head.next != null){
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        } return false;
    }
}