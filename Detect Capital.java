Question link - https://leetcode.com/problems/detect-capital/description/

class Solution {
    public boolean detectCapitalUse(String word) {
        String upperWord = word.toUpperCase();
        String lowerWord = word.toLowerCase();
        String oneCap = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if(word.equals(upperWord)){
            return true;
        }
        if(word.equals(lowerWord)){
            return true;
        }
        if(word.equals(oneCap)){
            return true;
        }
        return false;
    }
}
