class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R = matrix.length,C=matrix[0].length;
        int l=0,r=R*C-1;
        while(l<=r){
            int mid=(r+l)/2;
            int row=mid/C;
            int col=mid%C;
            if(target>matrix[row][col]){
                l=mid+1;
            }else if(target<matrix[row][col]){
                r=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
