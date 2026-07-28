class Solution {
    int res=0;
    Set<Integer> col = new HashSet<>();
    Set<Integer> nd = new HashSet<>();
    Set<Integer> pd = new HashSet<>();
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        bt(board,n,0);
        return res;
    }

    private void bt(char[][]board, int n, int r){
        if(r==n){
            res+=1;
        }
        for(int c=0;c<n;c++){
            if(col.contains(c)||nd.contains(r-c)||pd.contains(r+c)) continue;
            board[r][c]='Q';
            col.add(c);
            nd.add(r-c);
            pd.add(r+c);
            bt(board,n,r+1);
            board[r][c]='.';
            col.remove(c);
            nd.remove(r-c);
            pd.remove(r+c);
        }
    }
}