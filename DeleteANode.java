Node Delete(Node head, int position) {
    if (position == 0) {
        return head.next;
    } else {
        Node iterator = head;
        for (int i = 1; i < position; i++) {
            iterator = iterator.next;
        }
        iterator.next = iterator.next.next;
        return head;
    }
}
