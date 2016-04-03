void ReversePrint(Node head) {
    if (head != null) {
        ReversePrint(head.next);
        System.out.println(head.data);
    }
}
