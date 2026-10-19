class Solution {
    public double myPow(double x, int n) {
        if(n<0) return 1/pow(x,-(long)n);
        return pow(x,n);
    }
    private double pow(double x, long n){
        if(n==0) return 1.0;
        double half = pow(x,n/2);
        if(n%2==1) return half*half*x;
        return half*half;
    }
}
