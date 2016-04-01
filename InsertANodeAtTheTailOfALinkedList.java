Node Insert(Node head,int data) {
    Node newNode = new Node();
    newNode.data = data;
    
    if (head == null) {
        head = newNode;
    } else {
        Node currNode = head;
        Node preNode = null;
        while (currNode != null) {
            preNode = currNode;
            currNode = currNode.next;
        }
        
        preNode.next = newNode;
    }
    
    return head;
}
