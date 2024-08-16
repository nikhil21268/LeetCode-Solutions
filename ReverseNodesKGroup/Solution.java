package ReverseNodesKGroup;

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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode node = head;

        ArrayList<Integer> arr = new ArrayList<>();

        int len = 0;
        while (node != null){
            len++;
            arr.add(node.val);
            node = node.next;
        }

        int idx = 0;
        while (idx + k - 1 < arr.size()){

            int left = idx;
            int right = left + k - 1;

            while(left < right){

                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);

                left++;
                right--;
            }

            idx = idx + k;

        }

        ListNode head2 = new ListNode(-1);
        ListNode headCopy = head2;

        idx = 0;
        while(idx < arr.size()){

            ListNode node1 = new ListNode(arr.get(idx));
            headCopy.next = node1;
            headCopy = headCopy.next;

            idx++;
        }

        return head2.next;

    }
}