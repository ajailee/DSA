
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Cyclic {
    public static void main(String[] args) {
        ListNode _1 = new ListNode(3);
        ListNode _2 = new ListNode(2);
        ListNode _3 = new ListNode(0);
        ListNode _4 = new ListNode(-4);
        _1.next = _2;
        _2.next = _3;
        _3.next = _4;
        System.out.println(isCyclic(_1));
    }

    public static boolean isCyclic(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            ListNode inner = current;
            while (inner != null) {
                System.out.println(inner.val);
                if (inner.next == current) {
                    return true;
                }
                inner = inner.next;
            }
            current = current.next;
        }
        return false;
    }
}
