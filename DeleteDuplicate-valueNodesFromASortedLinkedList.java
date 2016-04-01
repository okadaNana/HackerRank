Node RemoveDuplicates(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node currNode = head;
    Node preNode = head;

    while (currNode != null) {
        preNode = currNode;
        currNode = currNode.next;

        if (currNode != null && currNode.data == preNode.data) {
            preNode.next = currNode.next;
            currNode = preNode;
        }
    }

    return head;
}