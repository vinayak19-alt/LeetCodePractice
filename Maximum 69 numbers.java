Question link - https://leetcode.com/problems/maximum-69-number/description/

class Solution {
    public int maximum69Number (int num) {
        return Integer.parseInt((""+num).replaceFirst("6","9"));
    }
}
