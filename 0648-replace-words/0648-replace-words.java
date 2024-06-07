class Node {
    Node[] child;
    boolean isword;
    
    Node() {
        child = new Node[26];
        isword = false;
    }
}

class Trie {
    Node root;
    
    Trie() {
        root = new Node();
    }

    public void add(String word) {
        Node temp = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (temp.child[index] == null) {
                temp.child[index] = new Node();
            }
            temp = temp.child[index];
        }
        temp.isword = true;
    }

    public String findPrefix(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (temp.child[index] == null) {
                return "";
            }
            temp = temp.child[index];
            if (temp.isword) {
                return word.substring(0, i + 1);
            }
        }
        return "";
    }
}

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder res = new StringBuilder();
        Trie trie = new Trie();
        for (String word : dictionary) {
            trie.add(word);
        }

        String[] words = sentence.split(" ");

        for (String word : words) {
            String prefix = trie.findPrefix(word);
            if (prefix.isEmpty()) {
                res.append(word);
            } else {
                res.append(prefix);
            }
            res.append(" ");
        }

        return res.toString().trim();
    }
}