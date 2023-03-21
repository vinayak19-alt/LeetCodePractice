Question link - https://leetcode.com/problems/minimum-moves-to-convert-string/description/

class Solution {
    public int minimumMoves(String s) {
        int i=0, count=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i=i+3;
                count++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}
