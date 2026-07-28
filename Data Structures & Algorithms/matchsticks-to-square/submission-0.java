class Solution {
    public boolean makesquare(int[] matchsticks) {
        int totalLength = Arrays.stream(matchsticks).sum();
        if(totalLength%4 !=0) return false;
        int length = totalLength/4;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int [] sides = new int[4];
        return bt(matchsticks, sides, 0,length);
    }
    private boolean bt(int [] matchsticks, int [] sides, int index, int length){
        if(index==matchsticks.length) return true;
        for(int i=0;i<4;i++){
            if(sides[i]+matchsticks[index]<=length){
            sides[i]+=matchsticks[index];
            if(bt(matchsticks, sides,index+1,length)) return true;
            sides[i]-=matchsticks[index];
            }
            if(sides[i]==0) break;
        }

        return false;

    }
    static void reverse(int [] matchsticks){
        int l=0;
        int r=matchsticks.length-1;
        while(l<r){
            int temp=matchsticks[l];
            matchsticks[l]=matchsticks[r];
            matchsticks[r]=temp;
            l++;
            r--;
        }
    }
}