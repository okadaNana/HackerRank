/*
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
 */

// Use recursion
void Print(Node head) {
	if (head == null) {
		return;
	} else {
		System.out.println(head.data);
		Print(head.next);
	}
}

// use loop
void Print(Node head) {
	while (head != null) {
		System.out.println(head.data);
		head = head.next;
	}
}
