/*
 * https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list
 */

// use loop
Node RemoveDuplicates(Node head) {
    Node currNode = head;
    while (currNode != null && currNode.next != null) {
        if (currNode.data == currNode.next.data) {
            currNode.next = currNode.next.next;
        } else {
            currNode = currNode.next;
        }
    }
    return head;
}


// use recursion
Node RemoveDuplicates(Node head) {
    if (head == null) {
        return head;
    }

    Node nextNode = head.next;
    while (nextNode != null && head.data == nextNode.data) {
        nextNode = nextNode.next;
    }
    head.next = RemoveDuplicates(nextNode);
    return head;
}
