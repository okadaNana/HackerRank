Node MergeLists(Node headA, Node headB) {
    if (headA == null) {
        return headB;
    }

    if (headB == null) {
        return headA;
    }

    Node smallerNode = null;
    if (headA.data < headB.data) {
        smallerNode = headA;
        smallerNode.next = MergeLists(headA.next, headB);
    } else {
        smallerNode = headB;
        smallerNode.next = MergeLists(headB.next, headA);
    }

    return smallerNode;
}