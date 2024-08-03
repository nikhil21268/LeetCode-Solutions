package Practice.AddTwoNumbers;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> res = new ArrayList<>();
        int carry = 0;
        int currSum = 0;
        while(l1 != null && l2 != null){
            currSum = l1.val + l2.val + carry;
            if(currSum >= 10){
                carry = currSum / 10;
                currSum = currSum % 10;
            }
            else carry = 0;
            res.add(currSum);
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            currSum = l1.val + carry;
            if(currSum >= 10){
                carry = currSum / 10;
                currSum = currSum % 10;
            }
            else carry = 0;
            res.add(currSum);
            l1 = l1.next;
        }
        while(l2 != null){
            currSum = l2.val + carry;
            if(currSum >= 10){
                carry = currSum / 10;
                currSum = currSum % 10;
            } else carry = 0;
            res.add(currSum);
            l2 = l2.next;
        }
        if(carry > 0){
            res.add(carry);
        }
        ListNode head = new ListNode(-1);
        ListNode headStore = head;
        for(int i: res){
            ListNode node = new ListNode(i);
            headStore.next = node;
            headStore = node;
        } return head.next;
    }
}