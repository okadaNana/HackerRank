/*
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list
 */

Node Reverse(Node head) {
    // empty list
    if (head == null) {
        return head;
    }

    // list has only one element
    if (head.next == null) {
        return head;
    }

    // list at least has two elements
    Node prevNode = null;
    Node currNode = head;
    Node nextNode = null;
    while (currNode != null) {
        // record next node
        nextNode = currNode.next;

        // switch prev and next pointer
        currNode.prev = nextNode; 
        currNode.next = prevNode;
        
        // record currNode as prevNode and pointer move to next node
        prevNode = currNode;
        currNode = nextNode;
    }
    return prevNode;
}