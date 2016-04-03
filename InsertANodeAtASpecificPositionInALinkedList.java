Node InsertNth(Node head, int data, int position) {
	Node newNode = new Node();
	newNode.data = data;

    if (head == null) {
    	return newNode;
    } else if (position == 0) {
    	newNode.next = head;
    	return newNode;
    } else {
    	int idx = 0;
    	Node currNode = head;
    	while (currNode != null) {
    		idx++;
    		if (idx == position) {
    			newNode.next = currNode.next;
    			currNode.next = newNode;
    		}
    		currNode = currNode.next;
    	}
    	return head;
    }
}
