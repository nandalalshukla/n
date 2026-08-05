class Solution {
    public String longestPalindrome(String s) {
        int reslen=0, residx=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while(l>=0 && r<n && s.charAt(r)==s.charAt(l)){
                if(r-l+1>reslen){
                    residx=l;
                    reslen=r-l+1;
                }
                l--;
                r++;
            }

            l=i;
            r=i+1;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                if(r-l+1>reslen){
                    residx=l;
                    reslen=r-l+1;
                }
                l--;
                r++;
            }

        }
        return s.substring(residx,residx+reslen);
    }
}
