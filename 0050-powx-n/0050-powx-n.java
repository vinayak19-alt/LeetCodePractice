class Solution {
    public double myPow(double x, int n) {
        if(n < 0) {
            n = -1*n;
            x = 1/x;
        }
        return helper(x, n);
    }
    public double helper(double x, int n){
        if(n==0){
            return 1;
        }
        double half = helper(x, n/2);
        if(n %2 ==0){
            return half * half;
        }else{
            return half * half * x;
        }
    }
}