package LeetCode;

public class RemoveDuplicatefromSortedLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode res = deleteDuplicates(head);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (head == null) {
            return head;
        }
        while (head.next != null && head != null) {
            if (head.next.val == head.val) {
                head.next = head.next.next;
            } else
                head = head.next;
        }
        return temp;
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