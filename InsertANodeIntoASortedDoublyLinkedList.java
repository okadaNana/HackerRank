/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head, int data) {
	Node newNode = new Node();
	newNode.data = data;
	
	if (head == null) {
		// eEmpty
		return newNode;
	} else if (head.next == null) {
		// just one node
		if (newNode.data < head.data) {
			newNode.next = head;
			head.prev = newNode;
			
			return newNode;
		} else {
			newNode.prev = head;
			head.next = newNode;
			
			return head;
		}
	} else {
		Node currNode = head;
		Node preNode = currNode.prev;
		while (currNode != null) {
			if (newNode.data >= currNode.data) {
				preNode = currNode;
				currNode = currNode.next;
			} else {
				break;
			}
		}
		
		if (currNode == null) {
			preNode.next = newNode;
			newNode.prev = preNode;
		} else {
			if (preNode == null) {
				newNode.next = currNode;
				currNode.prev = newNode;
				
				return newNode;
			} else {
				newNode.prev = preNode;
				preNode.next = newNode;
				newNode.next = currNode;
				currNode.prev = newNode;
				
				return head;
			}
		}
	}
	return head;
}