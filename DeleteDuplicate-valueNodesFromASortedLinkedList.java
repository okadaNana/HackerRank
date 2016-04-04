Node RemoveDuplicates(Node head) {
    if (head == null) {
        return head;
    }

    Node currNode = head;
    while (currNode.next != null) {
        if (currNode.data == currNode.next.data) {
            currNode.next = currNode.next.next;
            continue;
        }

        currNode = currNode.next;
    }

    return head;
}
