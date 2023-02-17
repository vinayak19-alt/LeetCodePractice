Question link - https://leetcode.com/problems/arranging-coins/description/

class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            n-=i;
            if(n<0){
                return i-1;
            }
            else if(n==0){
                return i;
            }
            i++;
        }
        return -1;
    }
}
