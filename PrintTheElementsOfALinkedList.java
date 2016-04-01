void Print(Node head) {
    if (head == null) {
        // Nothing to todo
    } else {
        System.out.println(head.data);
        head = head.next;
        Print(head);
    }
}