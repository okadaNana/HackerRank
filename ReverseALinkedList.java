Node Reverse(Node head) {
    if (head == null) {
        return null;
    }
    
    if (head.next == null) {
        return head;
    }
            
    Node preNode = null;
    Node currNode = head;
    Node nextNode = null;
     
    while (currNode != null) {
        nextNode = currNode.next;
        currNode.next = preNode;
        preNode = currNode;
        currNode = nextNode;
    }
    
    head = preNode;
    
    return head;
}