package LinkedListCycle2;

import java.util.HashMap;
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
    public ListNode detectCycle(ListNode head) {
        ListNode resNode = null;

        HashSet<ListNode> set = new HashSet<>();

        while(head != null){


            if(set.contains(head)) return head;
            set.add(head);

            head = head.next;
        }

        return resNode;
    }
}