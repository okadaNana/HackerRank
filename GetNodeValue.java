/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head, int n) {
    Node currNode = head;
    Node result = head;
    int index = 0;
    
    while (currNode != null) {
        if (index > n) {
            result = result.next;
        }
        index += 1;
        
        currNode = currNode.next;
    }
    
    return result.data;
}
