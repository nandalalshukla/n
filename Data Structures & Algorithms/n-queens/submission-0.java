class Solution {
    List<List<String>> res = new ArrayList<>();
    Set<Integer> col = new HashSet<>();
    Set<Integer> nd = new HashSet<>();
    Set<Integer> pd = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(char[] row: board){
           Arrays.fill(row,'.');
        }
        bt(board,0,n);
        return res;

    }
    private void bt(char[][] board, int r, int n){
        if(r==n){
            List<String> currList = new ArrayList<>();
            for(char[] row: board){
                currList.add(new String(row));
            }
            res.add(currList);
            return;
        }

        for(int c=0;c<n;c++){
            if(col.contains(c)||nd.contains(r-c)||pd.contains(r+c)) continue;
            board[r][c]='Q';
            col.add(c);
            nd.add(r-c);
            pd.add(r+c);

            bt(board,r+1,n);

            board[r][c]='.';
            col.remove(c);
            nd.remove(r-c);
            pd.remove(r+c);
        }
    }
}
