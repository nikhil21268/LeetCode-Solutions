package RemoveNthNodeFromEndOfList;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = head;

        int cnt = 0;

        while(node != null){

            node = node.next;
            cnt++;
        }

        int len = cnt;

        int toGo = len - n - 1;

        node = head;

        if(toGo == -1 && len == 1){

            return null;

        }

        else if(toGo == -1) return head.next;

        cnt = 0;
        while(cnt != toGo){
            cnt++;
            node = node.next;
        }

        if(node.next != null) node.next = node.next.next;

        return head;

    }
}
