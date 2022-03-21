package LeetCodeEasy;

// https://leetcode.com/problems/add-two-numbers/submissions/
class ListNode {
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
        int sum = 0;
        int carry = 0;
        ListNode head = null;
        ListNode last = null;
        // move till the last of both the LinkedList l1 !=null || l2 !=null
        // need to add the carry to the last node if carry>0 (edge test case)
        while (l1 != null || l2 != null || carry > 0) {
            int num1 = 0;
            int num2 = 0;
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }
            sum = carry + num1 + num2;
            int rem = sum % 10; // get the last digit
            carry = sum / 10; // get the carry

            // need to relearn the Linked List concepts
            if (head == null) {
                ListNode n = new ListNode(rem);
                head = n;
                last = n;
            } else {
                ListNode n = new ListNode(rem);
                last.next = n;
                last = n;
            }

        }
        return head;
    }
}