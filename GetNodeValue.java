int GetNode(Node head, int n) {
    Node iterator = head;
    Node targetNode = head;
    int count = 0;
    while (iterator != null) {
        iterator = iterator.next;
        if (count > n) {
            targetNode = targetNode.next;
        }
        count++;
    }

    return targetNode.data;
}
