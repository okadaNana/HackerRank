/*
 * https://www.hackerrank.com/challenges/reverse-a-linked-list
 */

// use loop
Node Reverse(Node head) {
    Node prevNode = null;
    Node currNode = head;
    Node nextNode = null;
    
    while (currNode != null) {
        // switch pointer
        nextNode = currNode.next;
        currNode.next = prevNode;
        
        // move pointer
        prevNode = currNode;
        currNode = nextNode;
    }
    return prevNode;  // new head
}
