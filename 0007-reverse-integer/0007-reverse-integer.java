class Solution {
    public int reverse(int x) {
        long reverse =0;
        int remainder=0;
        int temp=x;
        while(temp!=0){
            remainder = temp % 10;
            reverse = (reverse*10)+remainder;
            temp = temp/10;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reverse;
    }
}