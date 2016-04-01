Node Delete(Node head, int position) {
   if (head == null) {
		return head;
	} else if (head.next == null) {
		head = null;
		return head;
	} else {
		if (position == 0) {
			head = head.next;
			return head;
		} else {
			Node preNode = null;
			Node currNode = head;
			
			for (int i = 0; i < position; i++) {
				preNode = currNode;
				currNode = currNode.next;
			}			
			preNode.next = currNode.next;
			
			return head;
		}
	}
}