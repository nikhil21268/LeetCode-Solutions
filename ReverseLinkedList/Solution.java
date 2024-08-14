package ReverseLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode node = head;

        ArrayList<Integer> arr = new ArrayList<>();

        while (node != null){

            arr.add(node.val);

            node = node.next;
        }

        left--;
        right--;

        ArrayList<Integer> revArr = new ArrayList<>(arr);

        Collections.reverse(revArr);

        ListNode head2 = new ListNode();
        for (int i = 0; i < arr.size(); i++) {

        }

        return node;
    }
}