class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 0) return -1;
        int res=0;
        int c=0;
        for(int num:nums){
            if(c==0){
                c+=1;
                res=num;
            }
            else if(res==num){
                c+=1;
            }
            else{
                c-=1;
            }
        }
        return res;
    }
}