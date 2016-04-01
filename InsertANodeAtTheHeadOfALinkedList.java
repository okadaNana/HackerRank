Node Insert(Node head,int x) {
	Node newHeadNode = new Node();
	newHeadNode.data = x;
	
	if (head == null) {
		head = newHeadNode;
	} else {
		newHeadNode.next = head;
		head = newHeadNode;
	}
	
	return head;
}
