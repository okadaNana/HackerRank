Node Insert(Node head,int data) {
    Node newNode = new Node();
    newNode.data = data;
    if (head == null) {
        return newNode;
    } else {
        if (head.next == null) {
            head.next = newNode;
            return head;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            return head;
        }
    }
}
