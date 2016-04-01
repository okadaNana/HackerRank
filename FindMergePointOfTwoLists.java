int FindMergeNode(Node headA, Node headB) {
    Node currNodeA = headA;
    boolean found = false;
    
    while (currNodeA != null && !found) {
        Node currNodeB = headB;
        while (currNodeB != null) {
            if (currNodeA == currNodeB) {
                found = true;
                return currNodeA.data;
            }
            currNodeB = currNodeB.next;
        }
        currNodeA = currNodeA.next;
    }
    
    return 0;
}