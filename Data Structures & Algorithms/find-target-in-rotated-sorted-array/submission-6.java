class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }

        int res1= bs(nums,0,l-1,target);
        int res2=bs(nums,l,nums.length-1,target);
        if(res1!=-1) return res1;
        else return res2;
        
    }
    private int bs(int[]nums, int start, int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) start =mid+1;
            else end=mid-1;
        }
        return -1;
    }
}
