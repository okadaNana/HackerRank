/*
 * https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
 */

// use recursion
Node MergeLists(Node headA, Node headB) {
    if (headA == null) {
        return headB;
    }

    if (headB == null) {
        return headA;
    }

    if (headA.data < headB.data) {
        headA.next = MergeLists(headA.next, headB);
        return headA;
    } else {
        headB.next = MergeLists(headA, headB.next);
        return headB;
    }
}
