class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globalMax = nums[0], globalMin = nums[0];
        int currMax =0, currMin =0, total=0;

        for(int num:nums){
            currMax = Math.max(currMax+num,num);
            currMin = Math.min(currMin+num,num);
            total+=num;
            globalMax = Math.max(globalMax,currMax);
            globalMin= Math.min(globalMin, currMin);
        }
        if(globalMax>0){
            return Math.max(globalMax, total-globalMin);
        }else{
            return globalMax;
        }
    }
}