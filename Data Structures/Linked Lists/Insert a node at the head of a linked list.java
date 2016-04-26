/*
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
 */

Node Insert(Node head, int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if (head != null) {
        newNode.next = head;
    }
    return newNode;
}
