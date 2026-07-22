class Solution {
    ArrayList<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> curr = new ArrayList<>();
        bt(1, n, k, curr);
        return res;
    }
    private void bt(int i, int n, int k, List<Integer> curr){
        if(curr.size()==k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int j=i;j<=n;j++){
            curr.add(j);
            bt(j+1, n,k, curr);
            curr.remove(curr.size()-1);
        }
    }
}