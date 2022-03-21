package LeetCodeEasy;

public class Intersection {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headA1 = new ListNode(1);
        headA.next = headA1;

        ListNode headB = new ListNode(5);
        ListNode headB1 = new ListNode(6);
        ListNode headB2 = new ListNode(1);

        headB.next = headB1;
        headB1.next = headB2;

        ListNode headC = new ListNode(8);
        ListNode headC1 = new ListNode(4);
        ListNode headC2 = new ListNode(5);

        headC.next = headC1;
        headC1.next = headC2;

        headA1.next = headC;
        headB2.next = headC;

        int s = inter(headA, headB).val;
        System.out.println(s);
    }

    public static ListNode inter(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            while (tempB != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempB = headB;
            tempA = tempA.next;
        }
        return null;
    }
}


// ======================best solution=======================//
// public class Solution {
// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
// ListNode tempA=headA, tempB = headB;
// if(tempA==null || tempB==null) return null;
// while(tempA!=tempB){
// if(tempA==null){
// tempA=headB;
// }else{
// tempA=tempA.next;
// }
// if(tempB==null){
// tempB=headA;
// }else{
// tempB=tempB.next;
// }
// }
// return tempA;
// }
// }