Question link - https://leetcode.com/problems/excel-sheet-column-number/description/

class Solution {
    public int titleToNumber(String n) {
        n.toUpperCase();
        int num=0;
        int r;
        for(int i=0; i<n.length(); i++){
            r = ((int)n.charAt(i))-64;
            num = num*26 + r; 
        }
        return num;
    }
}
