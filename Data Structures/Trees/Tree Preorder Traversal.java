/*
 * https://www.hackerrank.com/challenges/tree-preorder-traversal
 */

// use recursion
void preOrder(Node root) {
    if (root != null) {
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}