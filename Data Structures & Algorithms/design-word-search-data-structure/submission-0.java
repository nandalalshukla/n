public class TrieNode{
    TrieNode node[];
    boolean wordEnd;
    public TrieNode(){
        node = new TrieNode[128];
        wordEnd=false;
    }
    void addChar(char ch){
        node[ch-'a']=new TrieNode();
    }
    boolean containsChar(char ch){
        return node[ch-'a']!=null;
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

class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode temp = root;
        for(char ch: word.toCharArray()){
            if(!temp.containsChar(ch)){
                temp.addChar(ch);
            }
            temp= temp.getChar(ch);
        }
        temp.markWordEnd();
    }

    public boolean search(String word) {
        return dfs(root,0,word);
    }
    private boolean dfs(TrieNode node, int i, String word){
        
        if(node==null) return false;
        if(i==word.length()) {
            return node.isWord();
        }
        char ch= word.charAt(i);
        if(ch=='.'){
            for(TrieNode child: node.node){
                if(child!=null&&dfs(child,i+1,word)) return true;
            }
            return false;
        }
        return dfs(node.getChar(ch),i+1,word);
    }
}
