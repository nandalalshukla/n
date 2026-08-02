class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left=0;
        int css=0;
        for(int right=0;right<nums.length;right++){
            css+=nums[right];
            while(css>=target){
                res=Math.min(res,right-left+1);
                css-=nums[left];
                left++;
            }
        }
        return res==Integer.MAX_VALUE? 0:res;
    }
}