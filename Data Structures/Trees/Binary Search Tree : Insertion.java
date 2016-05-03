/*
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion
 */

// use recursion
static Node Insert(Node root, int value) {
    if (root == null) {
        Node newNode = new Node();
        newNode.data = value;
        return newNode;
    }

    if (value < root.data) {
        root.left = Insert(root.left, value);
    } else {
        root.right = Insert(root.right, value);
    }
    return root;
}


// use loop
static Node Insert(Node root, int value) {
    Node newNode = new Node();
    newNode.data = value;

    if (root == null) {       
        return newNode;
    }

    Node iterator = root;
    while (iterator != null) {
        if (value < iterator.data) {
            if (iterator.left == null) {
                iterator.left = newNode;
                break;
            }
            iterator = iterator.left;
        } else {
            if (iterator.right == null) {
                iterator.right = newNode;
                break;
            }
            iterator = iterator.right;
        }
    }
    return root;
}
