Question link - https://leetcode.com/problems/split-a-string-in-balanced-strings/description/

class Solution {
    public int balancedStringSplit(String s) {
        int l=0, r=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                l++;
            }
            else{
                l--;
            }
            if(l==0){
                r++;
            }
        }
        return r;
    }
}
