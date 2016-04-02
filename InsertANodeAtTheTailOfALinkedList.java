Node Insert(Node head,int data) {
    Node newNode = new Node();
    newNode.data = data;
    if (head == null) {
        return newNode;
    } else {
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;
    }
}
