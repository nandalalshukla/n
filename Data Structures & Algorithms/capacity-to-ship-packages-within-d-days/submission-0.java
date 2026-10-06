class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int w:weights){
            left= Math.max(w,left);
            right+=w;
        }
        int res=Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            int shippingdays = shippingDays(mid,weights);
            if(shippingdays<=days){
                right=mid-1;
                res=Math.min(res,mid);
            }else{
                left=mid+1;
            }
        }
        return res;
        
        
    }
    private int shippingDays(int capacity, int[] weights ){
          int shippingdays=1;
          int res=capacity;
            for(int w: weights){
                if(capacity-w<0){
                    shippingdays++;
                    capacity=res;

                }
                capacity-=w;
            }
            return shippingdays;
    
    }
}