/*
 * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
 */

// use loop 1.0
Node Delete(Node head, int position) {
    int count = 0;
    Node prevDelete = null;
    Node currNode = head;

    while (currNode != null && count < position) {
        count++;
        prevDelete = currNode;
        currNode = currNode.next;
    }

    if (count != position) {
        // position out of list bound
    } else {
        if (prevDelete == null) {
            head = currNode.next;
        } else {
            prevDelete.next = currNode.next;
        }
    }
    return head;
}

// use loop 2.0
Node Delete(Node head, int position) {
    if (position == 0) {
        return head == null ? head : head.next;
    } else {
        int count = 0;
        Node prevDelete = head;
        Node currNode = head;

        while (count < position) {
            prevDelete = currNode;
            currNode = currNode.next;
            count++;
        }
        prevDelete.next = currNode.next;
        return head;
    }
}
