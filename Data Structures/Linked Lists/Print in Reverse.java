/*
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse
 */

// use recursion
void ReversePrint(Node head) {
    if (head != null) {
        ReversePrint(head.next);
        System.out.println(head.data);
    }
}


// use loop
void ReversePrint(Node head) {
    List<Node> nodeList = new ArrayList<>();
    Node iterator = head;
    while (iterator != null) {
        nodeList.add(iterator);
        iterator = iterator.next;
    }

    for (int i = nodeList.size() - 1; i >= 0; i--) {
        System.out.println(nodeList.get(i).data);
    }
}
