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

        if(head == null) return null;

        ListNode node = head;

        int len = 0;

        while (node.next != null){

            node = node.next;

            len++;
        }

        if(k > len + 1) k = k % (len + 1);

        if(len == 0) return head;

        if(len+1 == k) return head;

        node.next = head;

        node = head;

        int toGo = len - k;

//        System.out.println(len);
//        System.out.println(toGo);

        if(toGo < 0){

            while(toGo <= 0) toGo += len;

            while(toGo > 0){

                node = node.next;

                toGo--;
            }


            ListNode node2 = node;

            while(len >= 1){

                node2 = node2.next;

                len--;
            }


            node2.next = null;

            return node;

        }

//        System.out.println(toGo);

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

        return node;

    }
}