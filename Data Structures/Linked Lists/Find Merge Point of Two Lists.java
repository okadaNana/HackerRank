/*
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
 */

// use loop
int FindMergeNode(Node headA, Node headB) {
    Node iterator;
    while (headA != null) {
        iterator = headB;
        while (iterator != null) {
            if (headA == iterator) {
                return headA.data;
            }
            iterator = iterator.next;
        }
        headA = headA.next;
    }
    return 0;
}
