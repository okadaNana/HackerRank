/*
 * https://www.hackerrank.com/challenges/tree-inorder-traversal
 */

void Inorder(Node root) {
    if (root != null) {
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
}
