Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;

    if (position == 0) {
        newNode.next = head;
        return newNode;
    } else {
        Node targetNode = head;
        for (int i = 1; i < position; i++) {
            targetNode = targetNode.next;
        }
        newNode.next = targetNode.next;
        targetNode.next = newNode;
        return head;
    }
}
