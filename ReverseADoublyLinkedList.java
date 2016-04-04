Node Reverse(Node head) {
    if (head == null) {
        return null;
    }
    
    Node prevNode = null;
    Node currNode = head;
    Node nextNode = null;

    while (currNode != null) {
        nextNode = currNode.next;

        currNode.next = prevNode;
        currNode.prev = nextNode;

        prevNode = currNode;
        currNode = nextNode;     
    }
    head = prevNode;

    return head;
}
