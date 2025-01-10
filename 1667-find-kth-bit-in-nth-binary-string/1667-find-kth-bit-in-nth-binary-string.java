class Solution {
    public char findKthBit(int n, int k) {
        if(n==1 && k==1){
            return '0';
        }
        int len = (int)Math.pow(2,n)-1;
        int mid = len/2;
        if(k<=mid){
            return findKthBit(n-1, k);
        }else if(k>mid+1){
            return invert(findKthBit(n-1, len+1-k));
        }else{
            return '1';
        }
    }
    public char invert(char ch){
        if(ch=='0'){
            return '1';
        }else{
            return '0';
        }
    }
}