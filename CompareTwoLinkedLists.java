int CompareLists(Node headA, Node headB) {
    if (headA == null && headB == null) {
        return 1;
    } else if (headA == null || headB == null) {
        return 0;
    }

    if (headA.data == headB.data) {
        return CompareLists(headA.next, headB.next);
    } else {
        return 0;
    }
}