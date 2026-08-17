class Solution {
    public int[] countBits(int n) {
        int [] res = new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            int num=i;
            while(num!=0){
                num&=(num-1);
                c++;
            }
            res[i]=c;
        }
        return res;
    }
}
