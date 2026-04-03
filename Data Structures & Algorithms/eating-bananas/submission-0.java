class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lbph= 1,hbph=findMax(piles);
        while(lbph<=hbph){
            int mid=(lbph+hbph)/2;
            long tothrs=findTotal(piles, mid);
            if(tothrs<=h) hbph=mid-1;
            else lbph =mid+1;
        }
        return lbph;
    }
    public long findTotal(int[] arr, int mid){
        long totalhrs=0;
        for(int n:arr){
            totalhrs+=(n+mid-1)/mid;
        }
        return totalhrs;
    }
    public int findMax(int [] arr){
        int max=0;
        for(int n:arr){
            max = Math.max(max, n);
        }
        return max;
    }

}
