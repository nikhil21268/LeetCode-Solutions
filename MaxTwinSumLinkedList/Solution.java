package MaxTwinSumLinkedList;

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
    public int pairSum(ListNode head) {
        List<Integer> nodes = new ArrayList<>();
        while(head != null){
            nodes.add(head.val);
            head = head.next;
        }
        int leftPtr = 0;
        int rightPtr = nodes.size() - 1;
        int max = 0;
        while(leftPtr < rightPtr){
            max = Math.max(max, nodes.get(leftPtr) + nodes.get(rightPtr));
            leftPtr++;
            rightPtr--;
        } return max;
    }
}