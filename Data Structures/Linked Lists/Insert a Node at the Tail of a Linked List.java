/*
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list
 */

// use recursion
Node Insert(Node head, int data) {
    if (head == null) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    } else {
        if (head.next != null) {
            Insert(head.next, data);
        } else {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            head.next = newNode;
        }
        return head;
    }
}

// use loop
Node Insert(Node head, int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if (head == null) {
        return newNode;
    }

    Node tailNode = head;
    while (tailNode.next != null) {
        tailNode = tailNode.next;
    }
    tailNode.next = newNode;
    return head;
}
