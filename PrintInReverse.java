void ReversePrint(Node head) {
    if (head == null) {
        // Nothing to do
    } else {
        List<Integer> datas = new ArrayList<>();
        Node currNode = head;
        do {
            datas.add(currNode.data);
            currNode = currNode.next;
        } while (currNode != null);

        for (int i = datas.size() - 1; i >= 0; i--) {
            System.out.println(datas.get(i));
        }
    }
}