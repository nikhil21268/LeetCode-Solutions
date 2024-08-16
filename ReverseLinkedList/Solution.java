package ReverseLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left == right) return head;

        ListNode node = head;

        ArrayList<Integer> arr = new ArrayList<>();

        while (node != null){
            arr.add(node.val);
            node = node.next;
        }

        left--;
        right--;

        System.out.println(left);
        System.out.println(right);
        int i = 0;
        while (i < arr.size()){

            System.out.println("arr.size -> " + arr.size());

            if(i < left || i > right){
                i++;
            }

            else {
                int r = right;
                while(i < r){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(r));
                    arr.set(r, temp);

                    i++;
                    r--;
                }
                i = right + 1;
                System.out.println("i -> " + i);
            }

        }


        System.out.println();

        System.out.println("printing result array");

        for (i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        ListNode head2 = new ListNode(arr.get(0));
        ListNode headCopy = head2;

        int idx = 1;

        while(idx < arr.size()){

            ListNode newNode = new ListNode(arr.get(idx));
            headCopy.next = newNode;
            headCopy = headCopy.next;
            idx++;
        }

        return head2;
    }
}