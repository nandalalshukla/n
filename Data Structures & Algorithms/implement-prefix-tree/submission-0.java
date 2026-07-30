public class TrieNode{
    TrieNode node [];
    boolean wordEnd;
    TrieNode(){
        node = new TrieNode[26];
        wordEnd= false;
    }

    boolean containsChar(char ch){
        return node[ch-'a']!=null;
    }
    void addChar(char ch){
        node[ch-'a'] = new TrieNode();
    }
    TrieNode getChar(char ch){
        return node[ch-'a'];
    }
    void markWordEnd(){
        wordEnd=true;
    }
    boolean isWord(){
        return wordEnd;
    }
}
class PrefixTree {
    TrieNode root;

    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode temp =  root;
        for(char ch:word.toCharArray()){
            if(!temp.containsChar(ch)){
                temp.addChar(ch);
            }
            temp=temp.getChar(ch);
        }
        temp.markWordEnd();
    }

    public boolean search(String word) {
         TrieNode temp = root;
         for(char ch: word.toCharArray()){
            if(!temp.containsChar(ch)) return false;
           temp= temp.getChar(ch);
         }
         return temp.isWord();
    }

    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char ch: prefix.toCharArray()){
            if(!temp.containsChar(ch)) return false;
           temp= temp.getChar(ch);
        }
        return temp!=null;
    }
}
