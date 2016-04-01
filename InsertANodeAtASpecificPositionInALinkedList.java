Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;

    if (head == null) {
        head = newNode;
    } else {
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node currNode = head;
            Node preNode = head;
            int i = 0;

            while (currNode != null) {
                preNode = currNode;
                currNode = currNode.next;
                i++;
                if (position == i) {
                    preNode.next = newNode;
                    newNode.next = currNode;
                }
            }
        }
    }

    return head;
}