/*
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 */

int GetNode(Node head, int n) {
    Node iterator = head;
    Node targetNode = head;
    int count = 0;
    while (iterator != null) {
        if (count > n) {
            targetNode = targetNode.next;
        }
        count++;
        iterator = iterator.next;
    }
    return targetNode.data;
}
