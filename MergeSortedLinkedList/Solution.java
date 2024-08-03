package MergeSortedLinkedList;


import java.util.List;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        while(ptr1 != null && ptr2 != null){
            if(ptr1.val < ptr2.val){
                ptr1 = ptr1.next;
            } else {
                ListNode temp = ptr2.next;
                ptr2.next = ptr1.next;
                ptr1.next = ptr2;
                ptr2 = temp;
            }
        }
        return null;
    }
}