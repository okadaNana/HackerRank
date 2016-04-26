/*
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
 */

// use loop 1.0
Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;

    if (position == 0) {
        newNode.next = head;
        return newNode;
    } else {
        int count = 1;
        Node prevInsertion = head;
        while (count < position) {
            prevInsertion = prevInsertion.next;
            count++;
        }
        newNode.next = prevInsertion.next;
        prevInsertion.next = newNode;

        return head;
    }
}


// use loop 2.0
Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;

    int count = 0;
    Node prevInsertion = null;
    Node currNode = head;

    while (currNode != null && count < position) {
        prevInsertion = currNode;
        currNode = currNode.next;
        count++;
    }

    if (count != position) {
        // not enough node in the list
    } else {
        if (prevInsertion == null) {  // insert at first position
            head = newNode;
        } else {  // insert at any position
            newNode.next = currNode;
            prevInsertion.next = newNode;
        }
    }

    return head;
}
