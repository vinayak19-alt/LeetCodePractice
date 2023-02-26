Question link - https://leetcode.com/problems/is-subsequence/description/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int i=0;
        if(s.length()==0){
            return true;
        }
        for(i=0, j=0; i<t.length(); i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
        
        if(j==s.length()){
            return true;
        }
        }
        return false;
    }
}
