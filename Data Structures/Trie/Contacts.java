import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static class Node {
        Character data;
        Node[] next;
        int wordCount;
       
        public Node(Character data) {
            this.data = data;
            next = new Node[26];
        }
    }

    static class Trie {

        private Node root; // root of trie
        private Map<Character, Node> map;
         
        public Trie() {
            root = new Node(null);
            map = new HashMap<>();
        }
       
        public void add(String str) {
            Node currNode = root;
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                Node newNode = new Node(letter);
               
                if (i == 0) { // 根节点
                    Node dataNode = map.get(letter);                
                    if (dataNode == null) {
                        map.put(letter, newNode);
                        currNode = newNode;
                    } else {
                        currNode = dataNode;
                    }
                    currNode.wordCount++;
                } else {  // 子节点
                    Node dataNode = currNode.next[letter - 'a'];
                    if (dataNode == null) {
                        currNode.next[letter - 'a'] = newNode;
                        currNode = newNode;
                    } else {
                        currNode = dataNode;
                    }
                    currNode.wordCount++;
                }          
            }
        }
       
        public int wordCount(String str) {
            Node currNode = root;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (i == 0) {
                    Node dataNode = map.get(letter);                
                    if (dataNode == null) {
                        return 0;
                    } else {
                        currNode = dataNode;
                        count = currNode.wordCount;
                    }
                } else {
                    Node dataNode = currNode.next[letter - 'a'];
                    if (dataNode == null) {
                        return 0;
                    } else {
                        currNode = dataNode;
                        count = currNode.wordCount;
                    }
                }
            }
            return count;
        }
    }    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
       
        Trie trie = new Trie();
        for (int n = 0; n < N; n++) {
            String operation = scan.next();
            if ("add".equals(operation)) {
                trie.add(scan.next());
            } else if ("find".equals(operation)) {
                System.out.println(trie.wordCount(scan.next()));
            }
        }
        scan.close();
    }
}

}