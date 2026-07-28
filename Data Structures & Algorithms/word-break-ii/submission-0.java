class Solution {
    Set<String> wordSet ;
    List<String> res = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        wordSet = new HashSet<>(wordDict);
        bt(s,0,new ArrayList<>());
        return res;
    }
    private void bt(String s, int i, List<String> curr){
        if(i==s.length()){
            res.add(String.join(" ",curr));
        }
        for(int j=i;j<s.length();j++){
            String w = s.substring(i,j+1);
            if(wordSet.contains(w)){
                curr.add(w);
                bt(s,j+1,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}