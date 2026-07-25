class Solution {
    ArrayList<List<String>> res = new ArrayList<>();
    int n;
    public List<List<String>> partition(String s) {
        n=s.length();
        bt(s,0,new ArrayList<>());
        return res;
    }
    private void bt(String s, int pi, List<String> curr){
        if(pi==n){
            res.add(new ArrayList(curr));
            return;
        }
        for(int end=pi;end<n;end++){
            if(isP(s,pi,end)){
                curr.add(s.substring(pi,end+1));
                bt(s,end+1,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    private boolean isP(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
