Node SortedInsert(Node head, int data) {
    Node newNode = new Node();
    newNode.data = data;
    
    // Empty list
    if (head == null) {
        newNode.prev = null;
        newNode.next = null;
        return newNode;
    }
    
    // At the beginning of the list
    if (newNode.data < head.data) {
        newNode.prev = null;
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    } else {
        // Somewhere in the middle of the list
        Node currNode = head;
        while (currNode.next != null && currNode.next.data < newNode.data) {
            currNode = currNode.next;
        }
        newNode.prev = currNode;
        newNode.next = currNode.next;
        // At the end of the list
        if (currNode.next != null) {
            currNode.next.prev = newNode;
        }
        currNode.next = newNode;
        return head;
    }
}
