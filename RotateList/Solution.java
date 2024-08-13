package RotateList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        ListNode node = head;

        int len = 0;

        while (node.next != null){

            node = node.next;

            len++;
        }

        node.next = head;

        node = head;

        int toGo = len - k;

        if(toGo < 0){



        }

        else{

            while(toGo >= 0){

                node = node.next;

                toGo--;
            }


            ListNode node2 = node;

            while(len >= 1){

                node2 = node2.next;

                len--;
            }


            node2.next = null;

        }



        return node;

    }
}