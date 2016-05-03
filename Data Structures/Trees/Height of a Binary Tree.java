/*
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
 */

int height(Node root) {
    if (root == null) {
        return -1;
    } else {
        return Math.max(
            height(root.left) + 1,
            height(root.right) + 1
        );    
    }
}
