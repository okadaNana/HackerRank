int height(Node root) {
    if (root == null) {
        return 0;
    } else {
        return Math.max(
            height(root.left) + 1,
            height(root.right) + 1
        );
    }
}
