package SwapNodesInPairs;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode prevConn = new ListNode();

        ListNode dummy = new ListNode(-1);

        ListNode pair1 = new ListNode();
        ListNode pair2 = new ListNode();

        pair1 = head;
        pair2 = head.next;
        int firstOne = 1;

        while(pair1 != null && pair2 != null){


            ListNode store = new ListNode();
            store = pair2.next;

            pair2.next = pair1;
            pair1.next = store;


            if(firstOne == 1){
                firstOne = 0;
                dummy.next = pair2;
                prevConn = pair1;
            }

            else{
                prevConn.next = pair2;
                prevConn = pair1;
            }


            pair1 = pair1.next;
            if(pair1 == null) break;
            pair2 = pair1.next;



        }

        return dummy.next;

    }
}