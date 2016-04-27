/*
 * https://www.hackerrank.com/challenges/compare-two-linked-lists
 */

// use recursion
int CompareLists(Node headA, Node headB) {
    if (headA == null && headB == null) {
        return 1;
    }

    if (headA == null || headB == null) {
        return 0;
    }

    if (headA.data == headB.data) {
        return CompareLists(headA.next, headB.next);
    } else {
        return 0;
    }
}

// use loop
int CompareLists(Node headA, Node headB) {
    while (headA != null && headB != null) {
        if (headA.data == headB.data) {
            headA = headA.next;
            headB = headB.next;
        } else {
            return 0;
        }
    }

    return (headA == null && headB == null) ? 1 : 0;
}
