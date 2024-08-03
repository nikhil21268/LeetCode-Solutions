package RemoveLinkedListElements;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode headCopy = head;
        ListNode prevHeadCopy = null;
        if(headCopy != null && headCopy.val != val){
            while(headCopy != null){
                if(headCopy.val == val){
                    while(headCopy != null && headCopy.val == val) headCopy = headCopy.next;
                    prevHeadCopy.next = headCopy;
                }
                prevHeadCopy = headCopy;
                if(headCopy != null) headCopy = headCopy.next;
            }
        } else{
            while(headCopy != null && headCopy.val == val){
                prevHeadCopy = headCopy;
                headCopy = headCopy.next;
            }
            head = headCopy;
            while(headCopy != null){
                if(headCopy.val == val){
                    while(headCopy != null && headCopy.val == val) headCopy = headCopy.next;
                    prevHeadCopy.next = headCopy;
                }
                prevHeadCopy = headCopy;
                if(headCopy != null) headCopy = headCopy.next;
            }
        }
        return head;
    }
}