package MiddleLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode res = new ListNode();

        ListNode headCopy = head;
        int len = 0;

        while (headCopy != null){
            len++;
            headCopy = headCopy.next;
        }

        headCopy = head;

        if(true){

            int cnt = 0;
            while (cnt != len / 2){
                cnt++;
                headCopy = headCopy.next;
            }

            return headCopy;

        }


        return res;

    }
}