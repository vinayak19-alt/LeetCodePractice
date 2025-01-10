class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1 && k==1){
            return 0;
        }
        int len = (int)(Math.pow(2,n-1));
        int mid = len/2;
        if(k<=mid){
            return kthGrammar(n-1,k);
        }else if(k>mid+1){
            return invert(kthGrammar(n-1,k-mid));
        }else{
            return 1;
        }
    }
    public int invert(int n){
        if(n==1){
            return 0;
        }else{
            return 1;
        }
    }
}