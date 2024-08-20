package MergeTwoSortedLists;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode l = list1;
        ListNode r = list2;

        while (l != null && r != null){

            if(l.val < r.val){
                arr.add(l.val);
                l = l.next;
            }

            else if(l.val > r.val){
                arr.add(r.val);
                r = r.next;
            }

            else {
                arr.add(l.val);
                arr.add(r.val);

                l = l.next;
                r = r.next;
            }

        }

        while (l != null){
            arr.add(l.val);
            l = l.next;
        }


        while (r != null){
            arr.add(r.val);
            r = r.next;
        }

        ListNode head = new ListNode(-1);

        ListNode headCopy = head;

        for (int i: arr){

            ListNode newNode = new ListNode(i);

            headCopy.next = newNode;
            headCopy = headCopy.next;

        }

        return head.next;

    }
}