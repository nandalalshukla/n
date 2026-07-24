class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder stack = new StringBuilder();
        bt(0,0,n,stack);
        return res;
        
    }
    private void bt(int o, int c, int n, StringBuilder stack ){
        if(o==c && o==n){
            res.add(stack.toString());
            return;
        }
        if(o<n){
            stack.append('(');
            bt(o+1,c,n,stack);
            stack.deleteCharAt(stack.length()-1);
        }
        if(c<o){
            stack.append(')');
            bt(o,c+1,n,stack);
            stack.deleteCharAt(stack.length()-1);
        }
    }
}
