package Practice.AddTwoNumbers;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resHead = new ListNode(-1);

        ListNode res = resHead;

        ListNode head1 = l1;

        ListNode head2 = l2;

        int digit = -1;
        int carry = 0;




        while(head1 != null && head2 != null){

            digit = head1.val + head2.val + carry;

            if(digit > 9){

                carry = digit / 10;

                digit = digit % 10;
            }

            else carry = 0;

            ListNode newNode = new ListNode(digit);

            res.next = newNode;

            res = res.next;

            head1 = head1.next;
            head2 = head2.next;

        }

        while(head1 != null){

            digit = head1.val + carry;

            if(digit > 9){

                carry = digit / 10;

                digit = digit % 10;
            }

            else carry = 0;

            ListNode newNode = new ListNode(digit);

            res.next = newNode;

            res = res.next;

            head1 = head1.next;

        }

        while(head2 != null){

            digit = head2.val + carry;

            if(digit > 9){

                carry = digit / 10;

                digit = digit % 10;
            }

            else carry = 0;

            ListNode newNode = new ListNode(digit);

            res.next = newNode;

            res = res.next;

            head2 = head2.next;

        }

        while(carry != 0){

            digit = carry;

            if(digit > 9){

                carry = digit / 10;

                digit = digit % 10;
            }

            else carry = 0;

            ListNode newNode = new ListNode(digit);

            res.next = newNode;

            res = res.next;

        }

        return resHead.next;
    }
}