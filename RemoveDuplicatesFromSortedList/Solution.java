package RemoveDuplicatesFromSortedList;


import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode headCopy = head;
        ListNode prevheadCopy = null;
        HashSet<Integer> set = new HashSet<>();
        while(headCopy != null){
            if(set.contains(headCopy.val)){
                prevheadCopy.next = headCopy.next;
                headCopy = headCopy.next;
                continue;
            }
            set.add(headCopy.val);
            if(prevheadCopy == null) prevheadCopy = headCopy;
            else prevheadCopy = prevheadCopy.next;
            headCopy = headCopy.next;
        }
        return head;
    }
}