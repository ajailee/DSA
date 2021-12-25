package LeetCode;

/*

21. Merge Two Sorted Lists

Add to List

Share
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

*/

public class MergeLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        list1.next = n1;
        n1.next = n2;
        ListNode list2 = new ListNode(1);
        ListNode s1 = new ListNode(3);
        ListNode s2 = new ListNode(4);
        list2.next = s1;
        s1.next = s2;

        while (list2 != null) {
            ListNode node = new ListNode(list2.val);
            System.out.println(list2.val);
            if (node.val < list1.val) {
                node.next = list1;
                list1 = node;
            } else {
                sort(node, list1);
            }

            list2 = list2.next;

        }
        while (list1 != null) {

            System.out.println(list1.val);
            list1 = list1.next;

        }

    }

    public static void sort(ListNode s, ListNode n) {
        while (n != null) {
            if (s.val >= n.val && n.next == null) {
                n.next = s;
                n = s;
                break;
            } else if (s.val >= n.val && n.next.val > s.val) {
                s.next = n.next;
                n.next = s;
                break;
            } else {
                n = n.next;
            }
        }

    }

}

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