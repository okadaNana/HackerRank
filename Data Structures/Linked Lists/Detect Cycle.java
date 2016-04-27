/*
 * https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
 */

int HasCycle(Node head) {
    if (head == null) {
        return 0;
    }

    // run from origin node (head)
    Node slowNode = head;
    Node fastNode = head;

    while (fastNode != null && fastNode.next != null) {
        // fastNode run faster twice time than slowNode
        slowNode = slowNode.next;
        fastNode = fastNode.next.next;
        if (slowNode == fastNode) {
            return 1;
        }
    }
    return 0;
}
