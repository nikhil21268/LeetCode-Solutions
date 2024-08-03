package AddTwoNumbers;

  public class ListNode {
      int val;
      ListNode next;

      ListNode() {
      }

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        int sum, carry = 0;
        ListNode prevNode = new ListNode();
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            ListNode currNode = new ListNode();
            if (sum < 10) currNode.val = sum;
            else {
                currNode.val = sum % 10;
                carry = sum / 10;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = l1.val + carry;
            if (sum < 10) l1.val = sum;
            else {
                l1.val = sum % 10;
                carry = sum / 10;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + carry;
            if (sum < 10) l1.val = sum;
            else {
                l1.val = sum % 10;
                carry = sum / 10;
            }
            l2 = l2.next;
        }
        return l1;
    }
}